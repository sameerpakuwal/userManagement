package com.vastika.um.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.vastika.um.model.User;
import com.vastika.um.util.UserRowMapper;


public class UserRepositoryImpl implements UserRepository {

	private static final String SAVE_SQL = "insert into user_table(username,password,email,gender,hobbies,nationality,dob,mobileNo,comments,address)values(?,?,?,?,?,?,?,?,?,?)";
	private static final String LIST_SQL = "select * from user_table";
	private static final String DELETE_SQL = "delete from user_table where id =?";
	private static final String GET_USER_BY_ID_SQL = "select * from user_table where id  = ?";  
	private static final String UPDATE_SQL = "update user_table set username=?, password=?, email=?, gender=?, hobbies=?, nationality=?,dob=?, mobileNo=?, comments=?,  address=? where id=?";
	private static final String LOGIN_SQL = "select * from user_table where username  = ? and password = ?";
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public void saveUser(User user) {
	
		getJdbcTemplate(dataSource).update(SAVE_SQL, new Object[] {user.getUsername(),user.getPassword(),user.getEmail(),
				user.getGender(),user.getHobbies(),user.getNationality(),user.getDob(),
				user.getMobileNo(),user.getAddress(),user.getComments()});
	}

	@Override
	public List<User> getAllUser() {
		
		List<User> userList=getJdbcTemplate(dataSource).query(LIST_SQL, new UserRowMapper());
		return userList;
		
	}
 
	private  JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		
	return new JdbcTemplate(dataSource);	
}

	@Override
	public void deleteUser(int id) {
		getJdbcTemplate(dataSource).update(DELETE_SQL, new Object[] {id});
		
	}

	@Override
	public User getUserById(int id) {
		
		List<User> userList=getJdbcTemplate(dataSource).query(GET_USER_BY_ID_SQL,new Object[] {id}, new UserRowMapper());
		return userList.get(0);
	}

	
	@Override
	public void updateUser(User user) {
		getJdbcTemplate(dataSource).update(UPDATE_SQL, new Object[] {user.getUsername(),user.getPassword(),user.getEmail(),
				user.getGender(),user.getHobbies(),user.getNationality(),user.getDob(),
				user.getMobileNo(),user.getAddress(),user.getComments(), user.getId()});
		
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		List<User> userList=getJdbcTemplate(dataSource).query(LOGIN_SQL,new Object[] {username,password}, new UserRowMapper());
		if(!userList.isEmpty()) {
			return userList.get(0);
		}
		return null;
}
}

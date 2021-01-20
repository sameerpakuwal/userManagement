package com.vastika.um.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vastika.um.model.User;

public class UserRowExtractor implements ResultSetExtractor<User>{

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		User user = new User();
		
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		user.setGender(rs.getString("gender"));
		user.setHobbies(rs.getString("hobbies"));
		user.setNationality(rs.getString("nationality"));
		user.setDob(rs.getDate("dob"));
		user.setMobileNo(rs.getLong("mobileNo"));
		user.setComments(rs.getString("comments"));
		user.setAddress(rs.getString("address"));
		return user;
	}

}

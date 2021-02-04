package com.vastika.um.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.um.model.User;
import com.vastika.um.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String openLoginPage() {
		return "login";

	}

	@RequestMapping(value ="login", method= RequestMethod.POST)
	public String loginPage(@RequestParam String username,@RequestParam String password, HttpSession session, Model model ) {
		User user = userService.getUserByUsernameAndPassword(username, password);
		if (user!=null) {
			session.setAttribute("logged_username", username);
			return "redirect:/home";
		}
		model.addAttribute("loginFailMsg", "Wrong usename or password");
		return "login";

	}
	
	@RequestMapping("/logout")
	public String logoutPage(Model model, HttpSession session) {
		session.invalidate();
		model.addAttribute("logoutmsg", "hi! you havee sucessfully logged out!");
		return "log";

	}

}

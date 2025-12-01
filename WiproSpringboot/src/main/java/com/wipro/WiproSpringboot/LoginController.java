package com.wipro.WiproSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	JdbcTemplate jdbcobj;

	@GetMapping("/login")
	public String checkUser() {
		jdbcobj.update(
			    "INSERT INTO users(name, password, eid, salary) VALUES (?, ?, ?, ?)",
			    "javatpoint",
			    "java@javatpoint.com",
			    "E101",
			    50000
			);
		return "login success";
	}
	
//	@GetMapping("/login")
//	public String checkUser() {
//		jdbcobj.execute("insert into users(name,password)values('javatpoint','java@javatpoint.com')");  
//		return "login success";
//	}

}

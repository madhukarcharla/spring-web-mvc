package com.madhu.springweb.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.madhu.springweb.model.User;

@Component
public class UserDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public void insertUser(User user) {
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("fn", user.getFullName());
		params.addValue("pwd", user.getPassword());
		params.addValue("pn", user.getPhoneNumber());
		params.addValue("un", user.getUserName());
		params.addValue("id", Math.random());
		
		namedParameterJdbcTemplate.update("insert into user(id, full_name, password, phone_number,user_name) values (:id, :fn, :pwd, :pn, :un)"
						,params);
	}

}

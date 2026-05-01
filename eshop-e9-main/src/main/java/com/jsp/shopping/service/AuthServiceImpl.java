package com.jsp.shopping.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authorization.AuthorizationDeniedException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jsp.shopping.dao.UserDao;
import com.jsp.shopping.entity.User;
import com.jsp.shopping.security.JwtService;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private JwtService jwtService;

	@Override
	public Map<String, Object> login(String email, String password) {
		User user = userDao.findByEmail(email);
		if (!encoder.matches(password, user.getPassword()))
			throw new AuthorizationDeniedException("Invalid Password");
		return null;
	}
}
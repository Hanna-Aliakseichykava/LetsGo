package com.epam.mapsexample.db.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.mapsexample.db.model.AppUser;
import com.epam.mapsexample.db.repo.UserRepo;
import com.epam.mapsexample.db.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public List<AppUser> getAllUsers() {
		return userRepo.getAllUsers();
	}

}

package com.epam.mapsexample.db.repo;

import java.util.List;

import com.epam.mapsexample.db.model.AppUser;

public interface UserRepo {

	public void create(AppUser user);

	public void update(AppUser user);

	public AppUser getUserById(long id);

	public void delete(long id);

	public List<AppUser> getAllUsers();

}

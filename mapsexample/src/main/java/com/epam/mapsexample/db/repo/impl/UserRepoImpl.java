package com.epam.mapsexample.db.repo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.epam.mapsexample.db.model.AppUser;
import com.epam.mapsexample.db.repo.UserRepo;

@Repository
public class UserRepoImpl implements UserRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(AppUser user) {
		entityManager.persist(user);
	}

	@Override
	public void update(AppUser user) {
		entityManager.merge(user);
	}

	@Override
	public AppUser getUserById(long id) {
		return entityManager.find(AppUser.class, id);
	}

	@Override
	public void delete(long id) {
		AppUser user = getUserById(id);

		if (user != null) {
			entityManager.remove(user);
		}
	}

	@Override
	public List<AppUser> getAllUsers() {
		return entityManager.createQuery("Select u from AppUser u").getResultList();
	}
}

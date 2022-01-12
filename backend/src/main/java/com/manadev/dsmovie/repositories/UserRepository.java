package com.manadev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}

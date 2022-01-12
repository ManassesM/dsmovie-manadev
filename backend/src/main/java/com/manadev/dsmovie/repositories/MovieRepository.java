package com.manadev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}

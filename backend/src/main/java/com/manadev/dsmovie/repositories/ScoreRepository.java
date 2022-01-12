package com.manadev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.dsmovie.entities.Score;
import com.manadev.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}

package com.devsuperior.dslist.ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
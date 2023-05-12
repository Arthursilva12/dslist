package com.devsuperior.dslist.ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}

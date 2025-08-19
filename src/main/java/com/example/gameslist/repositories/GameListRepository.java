package com.example.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gameslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

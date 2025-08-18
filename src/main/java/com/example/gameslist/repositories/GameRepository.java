package com.example.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gameslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

package com.gamewiki.gamewiki.repositories;

import com.gamewiki.gamewiki.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

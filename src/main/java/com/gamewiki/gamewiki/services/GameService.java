package com.gamewiki.gamewiki.services;

import com.gamewiki.gamewiki.dto.GameMinDTO;
import com.gamewiki.gamewiki.entities.Game;
import com.gamewiki.gamewiki.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}

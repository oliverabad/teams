package com.equipos.app.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipos.app.models.Player;
import com.equipos.app.repositories.PlayerRepository;
import com.equipos.app.services.PlayerService;

@Service
public class PlayerServiceImplementation implements PlayerService {

	@Autowired
	private PlayerRepository repository;

	@Override
	public Player createPlayer(Player p) {
		return repository.insert(p);
	}

	@Override
	public List<Player> getAllPlayers() {
		return repository.findAll();
	}

	@Override
	public Player getPlayerById(String id) {
		return repository.findById(id).orElse(null);
	}
}

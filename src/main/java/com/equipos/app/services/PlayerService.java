package com.equipos.app.services;

import java.util.List;

import com.equipos.app.models.Player;

public interface PlayerService {

	Player createPlayer(Player p);

	List<Player> getAllPlayers();

	Player getPlayerById(String id);

}

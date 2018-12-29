package com.equipos.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipos.app.models.Player;
import com.equipos.app.services.PlayerService;

@RestController
@RequestMapping("/api")
public class PlayerController {
	@Autowired
	private PlayerService service;

	@GetMapping("/players")
	public List<Player> getAllPlayer() {
		return service.getAllPlayers();
	}

	@GetMapping("/players/{id}")
	public ResponseEntity<Player> getPlayerById(@PathVariable("id") String id) {
		Player player = service.getPlayerById(id);
		if (player != null) {
			return new ResponseEntity<Player>(player, HttpStatus.OK);
		}
		return new ResponseEntity<Player>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/players")
	public ResponseEntity<Player> createTeam(@Valid @RequestBody Player player) {
		Player playerCreated = service.createPlayer(player);
		return new ResponseEntity<Player>(playerCreated, HttpStatus.CREATED);
	}

}

package com.equipos.app.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equipos.app.models.Team;

@RestController
@RequestMapping("/api")
public class TeamController {
	@GetMapping("/teams")
	public String getAllTeam() {

		return "Get all Teams";
	}

	@GetMapping("/teams/{id}")
	public Team getTeamById(@PathVariable("id") String id) {
		Team team = new Team();
		team.setId("2");
		team.setTeam("Barcelona");
		return team;
	}

	@PostMapping("/teams")
	public String createTeam() {
		return "Create Post Team";
	}

	@PutMapping("/teams/{id}")
	public String updateTeamById(@PathVariable("id") String id) {
		return "Update Team by id " + id;
	}

	@DeleteMapping("/teams")
	public String deleteAllTeams() {
		return "Delete teams";
	}

	@DeleteMapping("/teams/{id}")
	public String deleteTeamById(@PathVariable("id") String id) {
		return "Delete Team by id " + id;
	}
}
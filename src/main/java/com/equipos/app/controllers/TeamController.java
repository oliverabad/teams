package com.equipos.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equipos.app.models.Team;
import com.equipos.app.services.TeamService;

@RestController
@RequestMapping("/api")
public class TeamController {

	@Autowired
	private TeamService service;

	@GetMapping("/teams")
	public List<Team> getAllTeam(@RequestParam(value = "city", required = false) String city) {
		if (city == null) {
			return service.getAllTeams();
		}
		return service.getTeamsByCity(city);
	}

	@GetMapping("/teams/{id}")
	public ResponseEntity<Team> getTeamById(@PathVariable("id") String id) {
		Team team = service.getTeamById(id);
		if (team != null) {
			return new ResponseEntity<Team>(team, HttpStatus.OK);
		}
		return new ResponseEntity<Team>(HttpStatus.NOT_FOUND);

	}

	@PostMapping("/teams")
	public ResponseEntity<Team> createTeam(@Valid @RequestBody Team team) {
		Team teamCreated = service.createTeam(team);
		return new ResponseEntity<Team>(teamCreated, HttpStatus.CREATED);
	}

	@PutMapping("/teams/{id}")
	public ResponseEntity<Team> updateTeamById(@Valid @RequestBody Team team, @PathVariable("id") String id) {
		team.setId(id);
		Team teamUpdate = service.updateTeamById(team);
		if (teamUpdate != null) {
			return new ResponseEntity<Team>(teamUpdate, HttpStatus.OK);
		}
		return new ResponseEntity<Team>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/teams")
	public String deleteAllTeams() {
		return "Delete teams";
	}

	@DeleteMapping("/teams/{id}")
	public ResponseEntity<Team> deleteTeamById(@PathVariable("id") String id) {
		if (service.deleteTeamById(id)) {
			return new ResponseEntity<Team>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Team>(HttpStatus.NOT_FOUND);
	}
}
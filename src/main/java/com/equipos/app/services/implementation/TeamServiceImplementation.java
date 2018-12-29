package com.equipos.app.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equipos.app.models.Team;
import com.equipos.app.repositories.TeamsRepository;
import com.equipos.app.services.TeamService;

@Service
public class TeamServiceImplementation implements TeamService {

	@Autowired
	private TeamsRepository repository;

	@Override
	public Team createTeam(Team t) {
		return repository.insert(t);
	}

	@Override
	public Team getTeamById(String id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Team> getAllTeams() {
		return repository.findAll();
	}

	@Override
	public Team updateTeamById(Team t) {
		if (repository.existsById(t.getId())) {
			return repository.save(t);
		}
		return null;
	}

	@Override
	public boolean deleteTeamById(String id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Team> getTeamsByCity(String city) {
		// return repository.findTeamsByCity(city);
		List<Team> listTeam = repository.findAll();
		List<Team> teams = new ArrayList<Team>();
		for (Team team : listTeam) {
			if (team.getCity().equals(city)) {
				teams.add(team);
			}
		}
		return teams;
	}

}

package com.equipos.app.services;

import java.util.List;

import com.equipos.app.models.Team;

public interface TeamService {
	Team createTeam(Team t);

	Team getTeamById(String id);

	List<Team> getAllTeams();

	Team updateTeamById(Team team);

	boolean deleteTeamById(String id);

	List<Team> getTeamsByCity(String city);

}

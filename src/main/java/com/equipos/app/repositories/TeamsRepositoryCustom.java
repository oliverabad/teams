package com.equipos.app.repositories;

import java.util.List;

import com.equipos.app.models.Team;

public interface TeamsRepositoryCustom {

	public List<Team> findTeamsByCity(String city);

}

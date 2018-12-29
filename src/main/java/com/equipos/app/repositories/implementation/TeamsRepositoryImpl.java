package com.equipos.app.repositories.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.equipos.app.models.Team;
import com.equipos.app.repositories.TeamsRepositoryCustom;

public class TeamsRepositoryImpl implements TeamsRepositoryCustom {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Team> findTeamsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}

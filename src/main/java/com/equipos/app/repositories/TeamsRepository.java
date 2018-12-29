package com.equipos.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipos.app.models.Team;

public interface TeamsRepository extends MongoRepository<Team, String>, TeamsRepositoryCustom {

}

package com.equipos.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.equipos.app.models.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {

}
//Importante MongoRepository nos genera el DAO
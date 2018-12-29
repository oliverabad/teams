package com.equipos.app.models;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Teams")
public class Team {
	@Id
	private String id;
	@NotBlank
	@Indexed(unique = true)
	private String team;
	@NotBlank
	private String city;
	@NotBlank
	@Indexed(unique = true)
	private String stadium;
	@DBRef
	private List<Player> players;

	public Team() {
	}

	public Team(String id, @NotBlank String team, @NotBlank String city, @NotBlank String stadium,
			List<Player> players) {
		super();
		this.id = id;
		this.team = team;
		this.city = city;
		this.stadium = stadium;
		this.players = players;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}

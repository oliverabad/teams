package com.equipos.app.models;

public class Team {
	private String id;
	private String team;

	public Team(String id, String team) {
		super();
		this.id = id;
		this.team = team;
	}

	public Team() {
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

}

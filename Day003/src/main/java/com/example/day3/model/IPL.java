package com.example.day3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IPL {
	@Id
	private int id;
	private String teamname;
	private String matcheswin;
	private String matchesloss;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getMatcheswin() {
		return matcheswin;
	}
	public void setMatcheswin(String matcheswin) {
		this.matcheswin = matcheswin;
	}
	public String getMatchesloss() {
		return matchesloss;
	}
	public void setMatchesloss(String matchesloss) {
		this.matchesloss = matchesloss;
	}
	
	
}

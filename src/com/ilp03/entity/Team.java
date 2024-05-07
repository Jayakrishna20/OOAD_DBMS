package com.ilp03.entity;

public class Team {
	private int teamId;

	public Team(int teamId, String teamName, Project projectId) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.projectId = projectId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Project getProjectId() {
		return projectId;
	}

	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}

	private String teamName;
	private Project projectId;

}

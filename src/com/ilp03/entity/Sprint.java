package com.ilp03.entity;

import java.util.Date;

public class Sprint {
	private int sprintId;
	private int sprintNumber;
	private Date startDate;
	private Date endDate;
	private Project project;

	public Sprint(int sprintId, int sprintNumber, Date startDate, Date endDate, Project project) {
		super();
		this.sprintId = sprintId;
		this.sprintNumber = sprintNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.project = project;
	}

	public int getSprintId() {
		return sprintId;
	}

	public void setSprintId(int sprintId) {
		this.sprintId = sprintId;
	}

	public int getSprintNumber() {
		return sprintNumber;
	}

	public void setSprintNumber(int sprintNumber) {
		this.sprintNumber = sprintNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}

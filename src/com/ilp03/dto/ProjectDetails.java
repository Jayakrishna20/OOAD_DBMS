package com.ilp03.dto;

public class ProjectDetails {
	private int projectId;
	private String projectName;
	private int sprintNumber;
	private String taskName;
	private int assignedTo;	
	private String status;
	private int priority;

	public ProjectDetails(int projectId, String projectName, int sprintNumber, String taskName, int assignedTo,
			String status, int priority) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.sprintNumber = sprintNumber;
		this.taskName = taskName;
		this.assignedTo = assignedTo;
		this.status = status;
		this.priority = priority;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getSprintNumber() {
		return sprintNumber;
	}

	public void setSprintNumber(int sprintNumber) {
		this.sprintNumber = sprintNumber;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}

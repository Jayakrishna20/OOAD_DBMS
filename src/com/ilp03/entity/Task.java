package com.ilp03.entity;

public class Task {
	private int taskId;
	private String taskName;
	private String description;
	private int assignedTo;
	private String status;
	private int priority;
	private Sprint sprint;

	public Task(int taskId, String taskName, String description, int assignedTo, String status, int priority,
			Sprint sprint) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.assignedTo = assignedTo;
		this.status = status;
		this.priority = priority;
		this.sprint = sprint;

	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	
	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
}

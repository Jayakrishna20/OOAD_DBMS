package com.ilp03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ilp03.dto.ProjectDetails;

public class ProjectDAO {
	// when i give the project id the output should be all the sprint with all
	// the Projects inside each sprint
	// which employee is assigned to which Project
	// status of each Project
	// priority of each Project

	public static ArrayList<ProjectDetails> getProjectDetailsUsingProjectId(Connection connection, int projectIdInput) {
		ArrayList<ProjectDetails> projectDetailsList = new ArrayList<ProjectDetails>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"select project.id,project.project_name, sprints.sprint_number, tasks.task_name,tasks.assigned_to,tasks.status,tasks.priority from  project inner join sprints on project.id=sprints.project_id inner join tasks on sprints.sprint_number = tasks.sprint_number where project.id=?;");
			preparedStatement.setInt(1, projectIdInput);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int projectId = resultSet.getInt(1);
				String projectName = resultSet.getString(2);
				int sprintNumber = resultSet.getInt(3);
				String taskName = resultSet.getString(4);
				int assignedTo = resultSet.getInt(5);
				String status = resultSet.getString(6);
				int priority = resultSet.getInt(7);

				ProjectDetails projectDetails = new ProjectDetails(projectId, projectName, sprintNumber, taskName,
						assignedTo, status, priority);

				projectDetailsList.add(projectDetails);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return projectDetailsList;
	}
}

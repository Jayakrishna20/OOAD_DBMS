package com.ilp03.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.ConnectionProvider;
import com.ilp03.dao.ProjectDAO;
import com.ilp03.dto.ProjectDetails;
import com.ilp03.entity.Task;

public class ProjectServiceImpl implements ProjectService {

	public void displayProjectData() {
		try {
			Connection connection = ConnectionProvider.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the project id");
			int projectId = scanner.nextInt();
			ArrayList<ProjectDetails> projectDetailsList = null;
			try {
				projectDetailsList = ProjectDAO.getProjectDetailsUsingProjectId(connection, projectId);

				System.out.println(
						"+------------+-----------------------------------+---------------+---------------------------------+-------------------+-------------+----------+");
				System.out.println(
						"| Project Id |     Project Name                  | Sprint Number |     Task Name                   |    Assigned To    |   Status    | Priority |");
				System.out.println(
						"+------------+-----------------------------------+---------------+---------------------------------+-------------------+-------------+----------+");

				for (ProjectDetails projectDetails : projectDetailsList) {
					System.out.printf("| %-10s | %-34s| %-13s | %-31s | %-17s | %-11s | %-8s |\n",
							projectDetails.getProjectId(),projectDetails.getProjectName(), projectDetails.getSprintNumber(),
							projectDetails.getTaskName(), projectDetails.getAssignedTo(), projectDetails.getStatus(),
							projectDetails.getPriority());
				}

				System.out.println(
						"+------------+-----------------------------------+---------------+---------------------------------+-------------------+-------------+----------+");

				connection.close();
			} catch (SQLException e) {

			}
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
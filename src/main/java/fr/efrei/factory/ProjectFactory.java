package fr.efrei.factory;

import fr.efrei.domain.Project;
import java.time.LocalDate;

public class ProjectFactory {

    public static Project createProject(String projectId, String name, String description, LocalDate startDate, LocalDate endDate, String status) {
        // Validate required parameters
        if (projectId == null || name == null || description == null) {
            throw new IllegalArgumentException("Project ID, name, and description cannot be null.");
        }

        return new Project.Builder()
                .setProjectId(projectId)
                .setName(name)
                .setDescription(description)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setStatus(status)
                .build();
    }
}

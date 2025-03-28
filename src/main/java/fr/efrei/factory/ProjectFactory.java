//230136982 Faranani Khangale
package fr.efrei.factory;

import fr.efrei.domain.Project;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProjectFactory {
    public static Project createProject(String projectId, String name, String description, LocalDate startDate, LocalDate endDate, String status) {
        if (projectId == null || name == null || description == null || startDate == null || endDate == null || status == null) {
            return null;  // Prevent invalid objects
        }

        return new Project.Builder()
                .setProjectId(projectId)
                .setName(name)
                .setDescription(description)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setStatus(status)
                .setTasks(new ArrayList<>())  // Initialize empty task list
                .build();
    }
}

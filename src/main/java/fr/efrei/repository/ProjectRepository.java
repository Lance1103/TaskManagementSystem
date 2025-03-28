//230136982 - Faranani Khangale
package fr.efrei.repository;

import fr.efrei.domain.Project;
import java.util.ArrayList;
import java.util.List;

public class ProjectRepository implements IProject {

    private static IProject repository = null;
    private List<Project> projectList;

    private ProjectRepository() {
        projectList = new ArrayList<>();
    }

    public static IProject getRepository() {
        if (repository == null) {
            repository = new ProjectRepository();
        }
        return repository;
    }

    @Override
    public Project create(Project project) {
        boolean success = projectList.add(project);
        return success ? project : null;
    }

    @Override
    public Project read(String projectId) {
        for (Project project : projectList) {
            if (project.getProjectId().equals(projectId)) {
                return project;
            }
        }
        return null;
    }

    @Override
    public Project update(Project updatedProject) {
        for (int i = 0; i < projectList.size(); i++) {
            if (projectList.get(i).getProjectId().equals(updatedProject.getProjectId())) {
                projectList.set(i, updatedProject);
                return updatedProject;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String projectId) {
        return projectList.removeIf(project -> project.getProjectId().equals(projectId));
    }

    @Override
    public List<Project> getAll() {
        return new ArrayList<>(projectList);
    }
}

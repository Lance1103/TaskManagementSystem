//230136982 - Faranani Khangale
package fr.efrei.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectId;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private List<TaskEntity> tasks;

    // Private constructor to enforce Builder pattern
    private Project() {}

    private Project(Builder builder) {
        this.projectId = builder.projectId;
        this.name = builder.name;
        this.description = builder.description;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.status = builder.status;
        this.tasks = (builder.tasks != null) ? builder.tasks : new ArrayList<>();
    }

    // Getters
    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public List<TaskEntity> getTasks() {
        return tasks;
    }

    // Method to add a task to the project
    public void addTask(TaskEntity task) {
        if (task != null) {
            this.tasks.add(task);
        }
    }

    // toString() method for easy printing
    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                ", tasks=" + tasks +
                '}';
    }


    public static class Builder {
        private String projectId;
        private String name;
        private String description;
        private LocalDate startDate;
        private LocalDate endDate;
        private String status;
        private List<TaskEntity> tasks;

        public Builder setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setTasks(List<TaskEntity> tasks) {
            this.tasks = tasks;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }
 /*   public static void main(String[] args) {
        Project project = new Builder()
                .setProjectId("ADP1")
                .setName("CAPSTONE")
                .setDescription("Building a capstone project")
                .setStartDate(LocalDate.now())
                .setEndDate(LocalDate.now())
                .setStatus("building")
                .setTasks(new ArrayList<>()) // Initialize tasks list to avoid null issues
               .build();
   }*/

}

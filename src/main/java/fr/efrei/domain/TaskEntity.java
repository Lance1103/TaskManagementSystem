/*TaskEntity.java
* TaskEntity model class
* Author: Lance Franks (230803865)*/

package fr.efrei.domain;

public class TaskEntity {
    private String taskName;
    private String taskDescription;
    private String dueDate;
    private String taskStatus;

    private TaskEntity() {}

    private TaskEntity(Builder builder) {
        this.taskName = builder.taskName;
        this.taskDescription = builder.taskDescription;
        this.dueDate = builder.dueDate;
        this.taskStatus = builder.taskStatus;

    }



    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    @Override
    public String toString() {
        return "TaskEntity{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", taskStatus=" + taskStatus +
                '}';
    }

    public static class Builder {
        private String taskName;
        private String taskDescription;
        private String dueDate;
        private String taskStatus;

        public Builder setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public Builder  setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }

        public Builder setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public TaskEntity build() { return new TaskEntity(this); }

        public Builder copy(TaskEntity task) {
            return null;
        }
    }
}

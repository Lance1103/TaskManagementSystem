package fr.efrei.factory;

import fr.efrei.domain.TaskEntity;

public class TaskFactory {
    public static TaskEntity createTask(String taskName, String description, String dueDate, String taskStatus ) {
        if (taskName == null || taskName.isEmpty())
            return null;
        if (description == null || description.isEmpty())
           return null;
        if (dueDate == null || dueDate.isEmpty())
            return null;
        if (taskStatus == null || taskStatus.isEmpty())
            return null;

        return new TaskEntity.Builder().setTaskName(taskName)
                .setTaskDescription(description)
                .setDueDate(dueDate)
                .setTaskStatus(taskStatus)
                .build();
    }
}

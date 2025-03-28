package fr.efrei.factory;

import fr.efrei.domain.TaskEntity;
import fr.efrei.util.Helper;

public class TaskEntityFactory {
    public static TaskEntity createTask(String taskName, String description, String dueDate, String taskStatus ) {
        if (Helper.isNullOrEmpty(taskName) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(dueDate) || Helper.isNullOrEmpty(taskStatus))
            return null;

        return new TaskEntity.Builder().setTaskName(taskName)
                .setTaskDescription(description)
                .setDueDate(dueDate)
                .setTaskStatus(taskStatus)
                .build();
    }

}

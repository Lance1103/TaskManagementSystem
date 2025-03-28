package fr.efrei.repository;

import fr.efrei.domain.TaskEntity;

import java.util.ArrayList;
import java.util.List;

public class TaskEntityRepository implements ITaskEntityRepository {

    private static ITaskEntityRepository repository = null;

    private List<TaskEntity> taskEntityList;


    private TaskEntityRepository() {
        taskEntityList = new ArrayList<TaskEntity>();
    }

    public static ITaskEntityRepository getRepository() {
        if (repository == null) {
            repository = new TaskEntityRepository();
        }
        return repository;
    }



    @Override
    public TaskEntity create(TaskEntity taskEntity) {
        boolean success = taskEntityList.add(taskEntity);
        if (success) {
            return taskEntity;
        }
        return null;
    }

    @Override
    public TaskEntity read(String taskName) {
        for (TaskEntity taskEntity : taskEntityList) {
            if (taskEntity.getTaskName().equals(taskName)) {
                return taskEntity;
            }
        }
        return null;
    }


    @Override
    public TaskEntity update(TaskEntity taskEntity) {
        String taskName = taskEntity.getTaskName();
        TaskEntity oldTaskEntity = read(taskName);
        if (oldTaskEntity == null)
            return null;
        boolean success = delete(taskName);
        if (success) {
            if (taskEntityList.add(taskEntity))
                 return taskEntity;

        }
        return null;
    }

    @Override
    public boolean delete(String taskName) {
        TaskEntity taskEntityToDelete = read(taskName);
        if (taskEntityToDelete == null)
            return false;
        return (taskEntityList.remove(taskEntityToDelete));
    }
    @Override
    public List<TaskEntity> getAll() {
        return taskEntityList;
    }
}

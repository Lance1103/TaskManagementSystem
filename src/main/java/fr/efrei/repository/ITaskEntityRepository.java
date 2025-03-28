package fr.efrei.repository;

import fr.efrei.domain.TaskEntity;

import java.util.List;


public interface ITaskEntityRepository extends IRepository<TaskEntity, String>{



      List<TaskEntity> getAll();
}

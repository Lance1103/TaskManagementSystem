package fr.efrei.repository;
import fr.efrei.domain.Project;

import java.util.List;
public interface IProject extends IRepository<Project, String>{

    List<Project> getAll();

}

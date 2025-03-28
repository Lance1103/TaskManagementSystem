package fr.efrei.repository;
import fr.efrei.domain.TeamEntity;
import java.util.List;
public interface ITeam extends IRepository <TeamEntity, String>{
    List<TeamEntity> getAll();
}
/*ITeam.java
ITeam interface class
Author: Thabiso Kama
Date: 22 March 2025
 */
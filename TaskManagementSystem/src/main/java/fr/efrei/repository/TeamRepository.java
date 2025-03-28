package fr.efrei.repository;

import fr.efrei.domain.TeamEntity;
import java.util.ArrayList;
import java.util.List;

public class TeamRepository implements ITeam {

    private static ITeam repository = null;
    private List<TeamEntity> teamList;

    private TeamRepository() {
        teamList = new ArrayList<>();
    }

    public static ITeam getRepository() {
        if (repository == null) {
            repository = new TeamRepository();
        }
        return repository;
    }

    @Override
    public TeamEntity create(TeamEntity team) {
        boolean success = teamList.add(team);
        return success ? team : null;
    }

    @Override
    public TeamEntity read(String teamID) {
        for (TeamEntity team : teamList) {
            if (team.getTeamId().equals(teamID)) {
                return team;
            }
        }
        return null;
    }

    @Override
    public TeamEntity update(TeamEntity updatedTeamEntity) {
        for (int i = 0; i < teamList.size(); i++) {
            if (teamList.get(i).getTeamId().equals(updatedTeamEntity.getTeamId())) {
                teamList.set(i, updatedTeamEntity);
                return updatedTeamEntity;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String teamID) {
        return teamList.removeIf(team -> team.getTeamId().equals(teamID));
    }

    @Override
    public List<TeamEntity> getAll() {
        return new ArrayList<>(teamList);
    }
}
/*TeamRepository.java
TeamRepository model class
Author: Thabiso Kama
Date: 22 March 2025
 */
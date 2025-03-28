package fr.efrei.factory;
import fr.efrei.domain.TeamEntity;
public class TeamFactory {
    public TeamEntity createTeamEntity(String teamID, String teamName, String member) {
        if (teamID == null || teamID.isEmpty())
            return null;
        if (teamName == null || teamName.isEmpty())
            return null;
        if (member == null || member.isEmpty())
            return null;

        return new TeamEntity.Builder()
                .setteamID(teamID)
                .setteamName(teamName)
                .setmember(member)
                .build();

    }
}
/*TeamFactory.java
TeamFactory model class
Author: Thabiso Kama
Date: 16 March 2025
 */
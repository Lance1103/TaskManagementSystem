package fr.efrei.domain;

public class TeamEntity {
    private String teamId;
    private String teamName;
    private String member;

    private TeamEntity (){}

    private TeamEntity(Builder builder){
        this.teamId = builder.teamId;
        this.teamName = builder.teamName;
        this.member = builder.member;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getMember() {
        return member;
    }

    @Override
    public String toString() {
        return "TeamEntity{" +
                "teamId='" + teamId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", member='" + member + '\'' +
                '}';
    }

    public static class Builder{
        private String teamId;
        private String teamName;
        private String member;

        public Builder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public Builder setMember(String member) {
            this.member = member;
            return this;
        }
        public TeamEntity build(){return new TeamEntity(this);}
    }
}
/*TeamEntity.java
TeamEntity model class
Author: Thabiso Kama
Date: 13 March 2025
 */

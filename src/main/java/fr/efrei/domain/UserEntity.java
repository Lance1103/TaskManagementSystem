/* UserEntity.java
UserEntity class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.domain;

public class UserEntity {

    private String userID;
    private String userName;
    private String userEmail;
    private String userRole;

    private UserEntity(){}

    private UserEntity(Builder builder ){
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.userEmail = builder.userEmail;
        this.userRole = builder.userRole;

    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserRole() {
        return userRole;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }

    public static class Builder{
        private String userID;
        private String userName;
        private String userEmail;
        private String userRole;

        public Builder setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }

        public UserEntity build(){ return new UserEntity(this);}

        public Builder copy(UserEntity user) {

            return null;
        }
    }
}

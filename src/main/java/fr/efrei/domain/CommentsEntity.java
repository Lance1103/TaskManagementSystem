package fr.efrei.domain;

public class CommentsEntity {

    private String userName;
    private String userComments;

    public CommentsEntity(){

    }

    public CommentsEntity(Builder builder) {
        this.userName = builder.userName;
        this.userComments = builder.userComments;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserComments() {
        return userComments;
    }

    @Override
    public String toString() {
        return "CommentsEntity{" +
                "userName='" + userName + '\'' +
                ", userComments='" + userComments + '\'' +
                '}';
    }

    public static class Builder{
        private String userName;
        private String userComments;
    }

   /* public Builder setUserName(String userName) {
        this.userName = userName;

        return this;
    }

    public Builder setUserComments(String userComments) {
        this.userComments = userComments;
        return this;
    }*/
    public CommentsEntity build(){
        return new CommentsEntity();
    }
}

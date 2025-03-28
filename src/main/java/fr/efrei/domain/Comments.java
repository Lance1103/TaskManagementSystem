//216269369 - Milani Ncana
package fr.efrei.domain;

public class Comments {

    private String userID;
    private String userName;
    private String userComments;
    private int ratings;

    public Comments(){

    }

    public Comments(Builder builder) {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.userComments = builder.userComments;
        this.ratings = builder.ratings;
    }

    public String getUserID(){
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserComments() {
        return userComments;
    }
    public int getRatings(){
        return ratings;
    }

    @Override
    public String toString() {
        return "Comments{" + "userID=" + userID +
                "userName='" + userName + '\'' +
                ", userComments='" + userComments + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    public static class Builder {
        private String userID;
        private String userName;
        private String userComments;
        private int ratings;


        public Builder setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserComments(String userComments) {
            this.userComments = userComments;
            return this;
        }

        public Builder setRatings(int ratings) {
            this.ratings = ratings;
            return this;
        }

        public Comments build() {
            return new Comments(this);
        }
    }
}
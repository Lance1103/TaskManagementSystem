package fr.efrei.factory;

import fr.efrei.domain.Comments;

public class CommentsFactory {

    public static Comments createCommentsEntity(String userID, String userName, String userComments, int ratings) {

        if (userID == null || userID.isEmpty()){
            return null;
        }
        if (userName == null || userName.isEmpty()){
            return null;
        }
        if (userComments == null || userComments.isEmpty()){
            return null;
        }
        if (ratings < 0 || ratings > 5){
            return null;
        }

        return new Comments.Builder().setUserID(userID)
                .setUserName(userName).setUserComments(userComments)
                .setRatings(ratings).build();
    }
}

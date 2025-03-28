//216269369 - Milani Ncana
package fr.efrei.repository;

import fr.efrei.domain.Comments;

import java.util.ArrayList;
import java.util.List;

public class CommentsRepository implements IRepository<Comments, String> {

    private final List<Comments> commentsDatabase = new ArrayList<>();

    @Override
    public Comments create(Comments comment) {
        if (comment == null || comment.getUserID() == null) {
            return null;
        }

        if (read(comment.getUserID()) != null) {
            return null;
        }
        commentsDatabase.add(comment);
        return comment;
    }

    @Override
    public Comments read(String userName) {

        for (Comments comment : commentsDatabase) {
            if (comment.getUserID().equals(userName)) {
                return comment;
            }
        }
        return null;
    }

    @Override
    public Comments update(Comments updatedComment) {
        String userID = updatedComment.getUserID();
        // Find index of existing comment
        for (int i = 0; i < commentsDatabase.size(); i++) {
            Comments existing = commentsDatabase.get(i);
            if (existing.getUserID().equals(userID)) {
                commentsDatabase.set(i, updatedComment);
                return updatedComment;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String userID) {

        for (int i = 0; i < commentsDatabase.size(); i++) {
            if (commentsDatabase.get(i).getUserID().equals(userID)) {
                commentsDatabase.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Comments> getAllComments() {
        return new ArrayList<>(commentsDatabase);
    }
}
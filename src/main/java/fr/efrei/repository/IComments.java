//216269369 - Milani Ncana
package fr.efrei.repository;

import fr.efrei.domain.Comments;

import java.util.List;

public interface IComments extends IRepository<Comments, String> {

    List<Comments> findByRating(int rating);
    List<Comments> findByUserID(String userID);
}
/* UserFactor.java
User Factory class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.factory;

import fr.efrei.domain.UserEntity;
import fr.efrei.util.Helper;

public class UserFactory {
    public static UserEntity createUserEntity(String userID, String userName, String userEmail, String userRole) {
        if(userID == null || userID.isEmpty())
            return null;
        if (userName == null || userName.isEmpty())
            return null;
        if (userEmail == null || userEmail.isEmpty())
            return null;
        if (userRole == null || userRole.isEmpty())
            return null;

        if (!Helper.isValidEmail(userEmail)) {
            return null;
        }

        return new UserEntity.Builder().setUserID(userID)
                .setUserName(userName)
                .setUserEmail(userEmail)
                .setUserRole(userRole)
                .build();


    }
}

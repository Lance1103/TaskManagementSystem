/* UserEntityReposity.java
UserEntity Repsoitory class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.repository;

import fr.efrei.domain.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserEntityRepository implements IUserRepository {

private static IUserRepository repository = null;

private List<UserEntity> usersList;

private UserEntityRepository(){
    usersList = new ArrayList<UserEntity>();

}

public static IUserRepository getRepository(){
    if(repository == null){
        repository = new UserEntityRepository();
    }
    return repository;
}



    @Override
    public UserEntity create(UserEntity userEntity) {
        boolean success = usersList.add(userEntity);
        if (success) {
            return userEntity;
        };
        return null;
    }

    @Override
    public UserEntity read(String userID) {
        for (UserEntity userEntity : usersList) {
            if (userEntity.getUserID().equals(userID))
                return userEntity;
        }
        return null;
    }

    @Override
    public UserEntity update(UserEntity userEntity) {
        String id = userEntity.getUserID();
        UserEntity OldUserEntity = read(id);
        if (OldUserEntity == null)
            return null;

        boolean success = delete(id);
        if (success) {
            if (usersList.add(userEntity))
                return userEntity;
        }
        return null;
    }

    @Override
    public boolean delete(String ID) {
        UserEntity DeleteuserEntity = read(ID);
        if (DeleteuserEntity == null)
        return false;
        return usersList.remove(DeleteuserEntity);
    }

    @Override
    public List<UserEntity> getAll() {
        return usersList;
    }
}

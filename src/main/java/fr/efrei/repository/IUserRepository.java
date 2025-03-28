/* iUserRepository.java
iUser Repository class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.repository;

import fr.efrei.domain.UserEntity;

import java.util.List;

public interface IUserRepository extends UserRepository<UserEntity, String >{

List<UserEntity> getAll();
}

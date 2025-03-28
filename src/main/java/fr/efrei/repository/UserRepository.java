/* UserRespository.java
User Repository class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.repository;

import fr.efrei.domain.UserEntity;

public interface UserRepository <U,ID> {

    U create(U u);

    U read(ID ID);

    U update(U u);

    boolean delete(ID ID);

}

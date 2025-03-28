/* UserEntityRepositoryTest.java
UserEntity Repository Test class
Author: Inam Jim (222086939)
Date: 28 March 2025
*/
package fr.efrei.repository;

import fr.efrei.domain.UserEntity;
import fr.efrei.factory.UserFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserEntityRepositoryTest {

    private static IUserRepository repository = UserEntityRepository.getRepository();

    private UserEntity user= UserFactory.createUserEntity
            ("222086939","Inam"
            ,"222086939@mycput.ac.za", "Admin");

    @Test
    void a_create() {
        UserEntity created = repository.create(user);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        UserEntity read = repository.read(user.getUserID());
        assertNotNull(user);
        System.out.println(user.toString());
    }

    @Test
    void c_update() {
        UserEntity newUserEntity = new UserEntity.Builder().copy(user).setUserName("Lance").build();
        UserEntity updated = repository.update(newUserEntity);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(user.getUserID()));
        System.out.println("Deleted User");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
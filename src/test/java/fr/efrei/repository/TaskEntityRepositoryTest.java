package fr.efrei.repository;

import fr.efrei.domain.TaskEntity;
import fr.efrei.factory.TaskEntityFactory;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TaskEntityRepositoryTest {
    private static ITaskEntityRepository repository = TaskEntityRepository.getRepository();

    private TaskEntity task= TaskEntityFactory.createTask("Meeting","Schedule", "Friday", "Incomplete");


    @Test
    void a_create() {
        TaskEntity created= repository.create(task);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        TaskEntity read = repository.read(task.getTaskName());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        TaskEntity newTask = new TaskEntity.Builder().copy(task).setTaskName("Collect").build();

        TaskEntity updated = repository.update(newTask);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(task.getTaskName()));
        System.out.println("Success: Task deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
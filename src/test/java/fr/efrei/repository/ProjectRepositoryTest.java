package fr.efrei.repository;

import fr.efrei.domain.Project;
import fr.efrei.factory.ProjectFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProjectRepositoryTest {
    private static final LocalDate startDate = LocalDate.now(); // Current date
    private static final LocalDate endDate = startDate.plusMonths(3); // Three months later

    private static final Project p1 = ProjectFactory.createProject(
            "ADP1",
            "Capstone",
            "Application Development",
            startDate,
            endDate,
            "In Progress"
    );

    @Test
    public void testCreateProject() {
        assertNotNull(p1);
        System.out.println("Created Project: " + p1);
    }

    @Test
    public void testCreateProjectWithAllAttributes() {
        Project project = ProjectFactory.createProject(
                "ADP2",
                "AI Research",
                "Artificial Intelligence Development",
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 12, 31),
                "Completed"
        );
        assertNotNull(project);
        assertEquals("ADP2", project.getProjectId());
        System.out.println("Created Project: " + project);
    }

    @Test
    public void testCreateProjectThatFails() {
        Project project = ProjectFactory.createProject(null, "Test", "Test Desc", startDate, endDate, "New");
        assertNull(project, "Project should not be created with a null ID");
    }

    @Test
    @Disabled
    public void testNotImplemented() {
        // This test is disabled
    }

    @Test
    void getAll() {

    }
}

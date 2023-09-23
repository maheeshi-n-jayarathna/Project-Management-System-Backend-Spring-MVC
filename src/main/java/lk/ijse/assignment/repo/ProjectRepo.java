package lk.ijse.assignment.repo;

import lk.ijse.assignment.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,String> {
}

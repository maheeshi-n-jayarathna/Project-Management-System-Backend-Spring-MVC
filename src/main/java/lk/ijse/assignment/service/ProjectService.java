package lk.ijse.assignment.service;

import lk.ijse.assignment.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {
    ProjectDTO saveProject(ProjectDTO projectDTO);

    void updateProject(String projectId, ProjectDTO projectDTO);

    void deleteProject(String projectId);

    List<ProjectDTO> getAllProject();

    ProjectDTO getProjectById(String projectId);
}

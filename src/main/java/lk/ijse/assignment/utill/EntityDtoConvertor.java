package lk.ijse.assignment.utill;

import lk.ijse.assignment.dto.ProjectDTO;
import lk.ijse.assignment.dto.TechLeadDTO;
import lk.ijse.assignment.entity.Project;
import lk.ijse.assignment.entity.TechLead;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoConvertor {
    @Autowired
    ModelMapper modelMapper;

    public Project getProjectEntity(ProjectDTO projectDTO){
        return modelMapper.map(projectDTO,Project.class);
    }

    public ProjectDTO getProjectDTO(Project project){
        return modelMapper.map(project,ProjectDTO.class);
    }

    public TechLead getTechLeadEntity(TechLeadDTO techLeadDTO){
        return modelMapper.map(techLeadDTO,TechLead.class);
    }

    public TechLeadDTO getTechLeadDTO(TechLead techLead){
        return modelMapper.map(techLead,TechLeadDTO.class);
    }
}

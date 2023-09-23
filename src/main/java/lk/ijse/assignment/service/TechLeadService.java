package lk.ijse.assignment.service;

import lk.ijse.assignment.dto.TechLeadDTO;

import java.util.List;

public interface TechLeadService {
    TechLeadDTO saveTechLead(TechLeadDTO techLeadDTO);

    void updateTechLead(String id, TechLeadDTO techLeadDTO);

    void deleteTechLead(String id);

    List<TechLeadDTO> getAllTechLead();

    TechLeadDTO getTeachLeadById(String id);
}

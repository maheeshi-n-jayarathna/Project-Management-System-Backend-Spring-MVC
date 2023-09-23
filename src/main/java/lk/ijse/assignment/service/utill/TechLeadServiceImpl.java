package lk.ijse.assignment.service.utill;

import lk.ijse.assignment.dto.TechLeadDTO;
import lk.ijse.assignment.entity.TechLead;
import lk.ijse.assignment.repo.TechLeadRepo;
import lk.ijse.assignment.service.TechLeadService;
import lk.ijse.assignment.utill.EntityDtoConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService {
    @Autowired
    EntityDtoConvertor entityDtoConvertor;

    @Autowired
    TechLeadRepo techLeadRepo;

    @Override
    public TechLeadDTO saveTechLead(TechLeadDTO techLeadDTO) {
        Optional<TechLead> optionalTechLead = techLeadRepo.findById(techLeadDTO.getId());
        if (optionalTechLead.isPresent()) {
            throw new RuntimeException("Duplicate Tech Lead id..!");
        }
        techLeadRepo.save(entityDtoConvertor.getTechLeadEntity(techLeadDTO));
        return techLeadDTO;
    }

    @Override
    public void updateTechLead(String id, TechLeadDTO techLeadDTO) {
        Optional<TechLead> optionalTechLead = techLeadRepo.findById(id);
        if (!optionalTechLead.isPresent())
            throw new RuntimeException("Id : " + id + " Tech Lead not found..!");
//        techLeadRepo.save(entityDtoConvertor.getTechLeadEntity(techLeadDTO));
    }

    @Override
    public void deleteTechLead(String id) {
        Optional<TechLead> optionalTechLead = techLeadRepo.findById(id);
        if (!optionalTechLead.isPresent())
            throw new RuntimeException("Id : " + id + " Tech Lead not found..!");
        techLeadRepo.deleteById(id);
    }

    @Override
    public List<TechLeadDTO> getAllTechLead() {
        return techLeadRepo.findAll().stream().map(techLead -> entityDtoConvertor.getTechLeadDTO(techLead)).collect(Collectors.toList());
    }

    @Override
    public TechLeadDTO getTeachLeadById(String id) {
        Optional<TechLead> optionalTechLead = techLeadRepo.findById(id);
        if (!optionalTechLead.isPresent())
            throw new RuntimeException("Id : " + id + " Tech Lead not found..!");
        return entityDtoConvertor.getTechLeadDTO(optionalTechLead.get());
    }
}

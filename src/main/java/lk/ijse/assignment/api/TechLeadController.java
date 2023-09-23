package lk.ijse.assignment.api;

import lk.ijse.assignment.dto.TechLeadDTO;
import lk.ijse.assignment.service.TechLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/techLead")
public class TechLeadController {
    @Autowired
    TechLeadService techLeadService;

    @GetMapping
    public ResponseEntity<List<TechLeadDTO>> getAllTechLead() {
        return new ResponseEntity<>(techLeadService.getAllTechLead(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<TechLeadDTO> getTechLeadById(@PathVariable String id) {
        return new ResponseEntity<>(techLeadService.getTeachLeadById(id), HttpStatus.OK);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<TechLeadDTO> saveTechLead(
            @RequestParam String id,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam BigDecimal salary,
            @RequestParam String telNumber
    ) {
        return new ResponseEntity<>(techLeadService.saveTechLead(new TechLeadDTO(
                id,
                name,
                email,
                salary,
                telNumber
        )), HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TechLeadDTO> saveTechLead(
            @RequestBody TechLeadDTO techLeadDTO
    ) {
        return new ResponseEntity<>(techLeadService.saveTechLead(techLeadDTO), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateTechLead(@PathVariable String id, @RequestBody TechLeadDTO techLeadDTO) {
        techLeadService.updateTechLead(id, techLeadDTO);
        return new ResponseEntity<>(id + " updated", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTechLead(@PathVariable String id) {
        techLeadService.deleteTechLead(id);
        return new ResponseEntity<>(id + " deleted", HttpStatus.OK);
    }
}

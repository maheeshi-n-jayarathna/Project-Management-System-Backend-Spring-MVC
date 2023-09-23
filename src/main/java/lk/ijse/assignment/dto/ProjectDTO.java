package lk.ijse.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDTO {
    String projectId;
    String projectName;
    String projectType;
    String description;
    BigDecimal totalCost;
    String techLeadId;
}

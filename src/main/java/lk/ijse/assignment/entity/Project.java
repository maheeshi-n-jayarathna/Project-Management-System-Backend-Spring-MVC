package lk.ijse.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
    @Id
    String projectId;
    @Column(nullable = false)
    String projectName;
    @Column(nullable = false)
    String projectType;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    BigDecimal totalCost;

    @ManyToOne
    @JoinColumn(name = "tl_id", nullable = false)
    TechLead techLead;
}

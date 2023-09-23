package lk.ijse.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLead {
    @Id
    String id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
    BigDecimal salary;
    @Column(nullable = false)
    String telNumber;

    @OneToMany(mappedBy = "techLead", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Project> projects;
}

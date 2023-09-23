package lk.ijse.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLeadDTO {
    String id;
    String name;
    String email;
    BigDecimal salary;
    String telNumber;
}

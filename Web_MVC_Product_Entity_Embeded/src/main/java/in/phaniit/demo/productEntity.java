package in.phaniit.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Entity
@Data
public class productEntity {
    @Id
    @GeneratedValue
    private Integer pid;
    private String  pname;
    private Double pprice;
    private Integer pquantity;

}

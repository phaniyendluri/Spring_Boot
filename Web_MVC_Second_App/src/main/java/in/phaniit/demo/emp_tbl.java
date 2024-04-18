package in.phaniit.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class emp_tbl {
    @Id
    private Integer emp_id;
    private String emp_dept;
    private String emp_gender;
    private String emp_name;
    private Integer emp_salary;
}

package in.phaniit.data_jpa_jpa_repo_app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "emp_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Integer empId;
    private String empName;
    private Double empSalary;
    private String empGender;
    private String empDept;
}

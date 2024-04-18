package in.phaniit.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student_enquires")
public class studentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;
    private String name;
    private String email;
    private String gender;
    private String course;
    private String Timings;
}

package in.phaniit.demo;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class studentService {
    @Autowired
    private studentRepository repo;
    public Boolean saveStudent(Student student) {
        studentEntity entity = new studentEntity();
        BeanUtils.copyProperties(student, entity);
        System.out.println("student object in service layer");
        System.out.println(student);
        entity.setTimings(Arrays.toString(student.getTimings()));
        System.out.println(entity);
        repo.save(entity);
        return true;
    }
    public List<String> getCourses(){
        return Arrays.asList("Java","Python","AWS","SpringBoot","Angular");
    }
    public List<String> getTimings(){
        return Arrays.asList("Morning","Afternoon","Evening");
    }
}

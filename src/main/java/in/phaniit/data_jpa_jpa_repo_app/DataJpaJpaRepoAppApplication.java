package in.phaniit.data_jpa_jpa_repo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DataJpaJpaRepoAppApplication {

    public static <pageRequest, page> void main(String[] args) {

        ConfigurableApplicationContext ctcx = SpringApplication.run(DataJpaJpaRepoAppApplication.class, args);
        EmpRepo Repository = ctcx.getBean(EmpRepo.class);
        System.out.println(Repository.getClass().getName());
        Employee e1 = new Employee(1,"phani",50000.00,"Male","sales");
        Employee e2 = new Employee(2,"Vaishu",55000.00,"Female","Dev");
        Employee e3 = new Employee(3,"Murali",60000.00,"Male","ServiceNow");
        Employee e4 = new Employee(4,"HS",65000.00,"Male","Management");
        Employee e5 = new Employee(5,"Aditya",70000.00,"Male","QA");
        Employee e6 = new Employee(6,"Devanshi",75000.00,"Male","Prod");

        Repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
        System.out.println("Records is inserted");
        Sort sort = Sort.by("empName","empSalary").descending();
        int pageNo = 1;
        PageRequest page=PageRequest.of(0, 2);
        page<Employee> findAll=Repository.findAll(page);
        List<Employee>emps = findAll.getContent();
//        int pageNo = 2;
//        List<Employee> emps = Repository.findAll(sort);
        emps.forEach(System.out::println);


    }

}

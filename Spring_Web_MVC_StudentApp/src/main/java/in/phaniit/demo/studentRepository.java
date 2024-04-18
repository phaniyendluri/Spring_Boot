package in.phaniit.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<studentEntity, Integer> {
}

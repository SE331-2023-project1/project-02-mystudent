package se331.lab.rest.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import se331.lab.rest.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();

    Page<User> findByNameContainingIgnoreCaseOrStudentID(String name ,String studentID, Pageable PageRequest);
}

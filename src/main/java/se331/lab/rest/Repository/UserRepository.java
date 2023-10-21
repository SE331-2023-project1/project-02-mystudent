package se331.lab.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.rest.Entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();
}

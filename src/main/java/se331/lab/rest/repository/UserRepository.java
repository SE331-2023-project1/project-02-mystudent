package se331.lab.rest.repository;

import se331.lab.rest.Entity.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO, Integer> {
}
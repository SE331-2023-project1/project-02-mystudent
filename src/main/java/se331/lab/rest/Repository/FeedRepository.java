package se331.lab.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.rest.Entity.Feed;
import se331.lab.rest.Entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface FeedRepository extends JpaRepository<Feed, Long> {

    List<Feed> findAll();
    Optional<Feed> findByName(String fileName);
}

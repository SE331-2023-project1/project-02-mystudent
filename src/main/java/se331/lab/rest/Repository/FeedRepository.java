package se331.lab.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.rest.Entity.Feed;
import java.util.Optional;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    Optional<Feed> findByName(String fileName);
}

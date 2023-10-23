//package se331.lab.rest.Repository;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//import se331.lab.rest.Entity.Teacher;
//
//import java.util.List;
//
//public interface TeacherRepository extends JpaRepository<Teacher, Long> {
//    List<Teacher> findAll();
//
//    Page<Teacher> findByNameContainingIgnoreCaseOrTeacherID(String name, String name1, Pageable page);
//}

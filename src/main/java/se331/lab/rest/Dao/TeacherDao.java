package se331.lab.rest.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.Entity.Teacher;

import java.util.Optional;

public interface TeacherDao {
    Integer getTeacherSize();

    Page<Teacher> getTeachers(Integer pageSize, Integer page);

    Teacher getTeacherById(Long id);

    Teacher save(Teacher teacher);

    Optional<Teacher> findById(Long id);

    Page<Teacher> getTeacher(String name, Pageable page);
}

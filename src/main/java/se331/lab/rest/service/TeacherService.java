package se331.lab.rest.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.Entity.Teacher;

public interface TeacherService {
    Page<Teacher> getTeachers(Integer pageSize, Integer page);

    Teacher getTeacher(Long id);

    Teacher save(Teacher advisor);

    Teacher getTeacherById(Long id);

    Page<Teacher> getTeacher(String name, Pageable page);
}

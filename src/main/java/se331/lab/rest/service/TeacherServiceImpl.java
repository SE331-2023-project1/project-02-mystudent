package se331.lab.rest.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab.rest.Entity.Teacher;
import se331.lab.rest.Dao.TeacherDao;
@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService{
    final TeacherDao teacherDao;
    @Override
    public Page<Teacher> getTeachers(Integer pageSize, Integer page) {
        return teacherDao.getTeachers(pageSize, page);
    }

    @Override
    public Teacher getTeacher(Long id) {
        return teacherDao.getTeacherById(id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherDao.findById(id).orElse(null);
    }

    @Override
    public Page<Teacher> getTeacher(String name, Pageable page) {
        return teacherDao.getTeacher(name, page);
    }
}

//package se331.lab.rest.Dao;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Repository;
//import se331.lab.rest.Entity.Teacher;
//import se331.lab.rest.Repository.TeacherRepository;
//
//import java.util.Optional;
//
//@Repository
//@RequiredArgsConstructor
//@Profile("db")
//public class TeacherDaoImpl implements  TeacherDao{
//    final TeacherRepository teacherRepository;
//
//    @Override
//    public Integer getTeacherSize() {
//        return Math.toIntExact(teacherRepository.count());
//    }
//
//    @Override
//    public Page<Teacher> getTeachers(Integer pageSize, Integer page) {
//        long totalEvents = teacherRepository.count();
//        pageSize = pageSize == null ? (int) totalEvents : pageSize;
//        page = page == null ? 0 : page - 1;
//        return teacherRepository.findAll(PageRequest.of(page, pageSize));
//    }
//
//    @Override
//    public Teacher getTeacherById(Long id) {
//        return teacherRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public Teacher save(Teacher advisor) {
//        return teacherRepository.save(advisor);
//    }
//
//    @Override
//    public Optional<Teacher> findById(Long id) {
//        return teacherRepository.findById(id);
//    }
//
//    @Override
//    public Page<Teacher> getTeacher(String name, Pageable page) {
//        return teacherRepository.findByNameContainingIgnoreCaseOrTeacherID(name, name, page);
//    }
//}

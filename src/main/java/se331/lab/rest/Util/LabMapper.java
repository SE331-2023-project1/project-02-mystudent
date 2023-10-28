package se331.lab.rest.Util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import se331.lab.rest.Dto.OwnStudentDto;
import se331.lab.rest.Dto.OwnTeacherDto;
import se331.lab.rest.Dto.StudentDto;
import se331.lab.rest.Dto.TeacherDto;
import se331.lab.rest.Entity.Teacher;
import se331.lab.rest.Entity.User;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    StudentDto getStudentDto(User user);
    List<StudentDto> getStudentDto(List<User> users);
    TeacherDto getTeacherDto(Teacher teacher);
    List<TeacherDto> getTeacherDto(List<Teacher> advisors);
    OwnTeacherDto getAdvisor(Teacher teacher);
    OwnStudentDto getAdvisee(User user);

}

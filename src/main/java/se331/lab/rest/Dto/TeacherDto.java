package se331.lab.rest.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {
    Long id;
    String position;
    String name;
    String surname;
    String image;
    String department;
    String teacherID;

    List<OwnStudentDto> studentList = new ArrayList<>();
}

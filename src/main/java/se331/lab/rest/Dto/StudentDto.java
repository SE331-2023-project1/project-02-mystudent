package se331.lab.rest.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    Long id;
    String studentID;
    String name;
    String surname;
    String image;
    String department;
    OwnTeacherDto teacher;
}

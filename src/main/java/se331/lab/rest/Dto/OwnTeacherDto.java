package se331.lab.rest.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OwnTeacherDto {
    Long id;
    String name;
    String surname;
    String department;
    String position;
    String teacherID;
    String image;
}

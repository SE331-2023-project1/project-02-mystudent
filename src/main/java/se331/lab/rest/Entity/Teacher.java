package se331.lab.rest.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String position;
    String name;
    String surname;
    String department;
    String image;
    String teacherID;
    String username;
    String password;
    @Builder.Default
    @OneToMany
    List<User> advisee = new ArrayList<>();
}

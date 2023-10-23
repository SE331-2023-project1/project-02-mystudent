package se331.lab.rest.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

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
//    @Builder.Default
//    @OneToMany
//    List<User> advisee = new ArrayList<>();
}

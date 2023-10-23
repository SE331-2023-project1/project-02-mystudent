package se331.lab.rest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Blob;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @EqualsAndHashCode.Exclude
    Long id;
    String username;
    String password;
    String role;
    String name;
    String surname;
    String image;
    String department;
    String studentID;

    String file;
    String fileDesc;
    String advisorName;
    String advisorSurname;
    String position;
    String advisorImage;

    String comment;
    String reply;
}

package se331.lab.rest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Blob;

@Data
@Builder
@Entity
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
    String position;
    String studentID;
    String comment;
    String reply;
    Blob file;
    String fileDesc;
    String advisor;
}

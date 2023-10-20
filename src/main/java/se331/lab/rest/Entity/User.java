package se331.lab.rest.Entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Blob;

@Data
@Builder
public class User {
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

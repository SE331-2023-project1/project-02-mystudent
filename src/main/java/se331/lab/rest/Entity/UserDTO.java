//package se331.lab.rest.Entity;
//
//import javax.persistence.*;
//import com.mysql.cj.jdbc.Blob;
//import jakarta.persistence.Entity;
//
//@Entity
//@Table(name = "user")
//
//public class UserDTO {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name = "username")
//    private String username;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "role")
//    private String role;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "surname")
//    private String surname;
//
//    @Column(name = "image")
//    private String image;
//
//    @Column(name = "department")
//    private String department;
//
//    @Column(name = "position")
//    private String position;
//
//    @Column(name = "studentID")
//    private String studentID;
//
//    @Column(name = "comment")
//    private String comment;
//
//    @Column(name = "reply")
//    private String reply;
//
//    @Column(name = "file")
//    private Blob file;
//
//    @Column(name = "fileDesc")
//    private String fileDesc;
//
//    @Column(name = "advisor")
//    private String advisor;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getPosition() {
//        return position;
//    }
//
//    public void setPosition(String position) {
//        this.position = position;
//    }
//
//    public String getStudentID() {
//        return studentID;
//    }
//
//    public void setStudentID(String studentID) {
//        this.studentID = studentID;
//    }
//
//    public String getComment() {
//        return comment;
//    }
//
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public String getReply() {
//        return reply;
//    }
//
//    public void setReply(String reply) {
//        this.reply = reply;
//    }
//
//    public Blob getFile() {
//        return file;
//    }
//
//    public void setFile(Blob file) {
//        this.file = file;
//    }
//
//    public String getFileDesc() {
//        return fileDesc;
//    }
//
//    public void setFileDesc(String fileDesc) {
//        this.fileDesc = fileDesc;
//    }
//
//    public String getAdvisor() {
//        return advisor;
//    }
//
//    public void setAdvisor(String advisor) {
//        this.advisor = advisor;
//    }
//}

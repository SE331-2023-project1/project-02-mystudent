package se331.lab.rest.Controller;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import se331.lab.rest.Entity.Teacher;
import se331.lab.rest.Entity.User;
import org.springframework.stereotype.Controller;
import se331.lab.rest.Service.FeedServiceImpl;
import se331.lab.rest.Service.TeacherService;

import java.io.IOException;

@Controller
@CrossOrigin(maxAge = 3600)
@RequiredArgsConstructor
public class TeacherController {
    final TeacherService teacherService;
    final FeedServiceImpl feedService;

    @GetMapping("teachers")
    public ResponseEntity<?> getTeacherLists(@RequestParam(value = "_limit", required = false) Integer perPage
            ,@RequestParam(value = "_page",required = false)Integer page) {
        Page<Teacher> pageOutput = teacherService.getTeachers(perPage, page);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count",
                String.valueOf(pageOutput.getTotalElements()));
        return new ResponseEntity<>(pageOutput.getContent(),responseHeader,HttpStatus.OK);
    }

    @GetMapping("teachers/{id}")
    public ResponseEntity<?> getTeacher(@PathVariable("id") Long id) {
        Teacher output = teacherService.getTeacher(id);
        if (output != null){
            return ResponseEntity.ok(output);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The Given id is not found");
        }
    }

    @PostMapping("/teachers")
    public ResponseEntity<?> addTeacher(@RequestBody Teacher teacher){
        Teacher output = teacherService.save(teacher);
        return ResponseEntity.ok(output);
    }

    @PutMapping("/updateTeacher/{id}")
    public ResponseEntity<?> updateTeacher(@PathVariable("id") Long id, @RequestBody Teacher updatedTeacher) {
        Teacher old = teacherService.getTeacher(id);
        if (updatedTeacher.getName() != null || updatedTeacher.getName() != ""){
            old.setName(updatedTeacher.getName());
        }
        if (updatedTeacher.getSurname() != null){
            old.setSurname(updatedTeacher.getSurname());
        }
        if (updatedTeacher.getDepartment() != null){
            old.setDepartment(updatedTeacher.getDepartment());
        }
        if (updatedTeacher.getPosition() != null){
            old.setPosition(updatedTeacher.getPosition());
        }
        if (updatedTeacher.getImage() != null){
            old.setImage(updatedTeacher.getImage());
        }

        Teacher output = teacherService.save(updatedTeacher);
        return ResponseEntity.ok(output);
    }
    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam("file")MultipartFile file) throws IOException {
        String uploadImage = feedService.uploadImage(file);
        return ResponseEntity.status(HttpStatus.OK)
                .body(uploadImage);
    }

    @GetMapping("/uploadFile/{fileName}")
    public ResponseEntity<?> downloadFile(@PathVariable String fileName){
        byte[] fileData = feedService.downloadImage(fileName);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(fileData);
    }
}

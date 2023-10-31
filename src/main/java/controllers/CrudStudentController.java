package controllers;

import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.StudentServices;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class CrudStudentController {

    @Autowired
    public CrudStudentController(StudentServices studentServices) {
    }

    @GetMapping // GET http://localhost:8080/api/students
    public List<String> getAllStudents() {
        return List.of("Maréchal Maxence", "Aurélien Lhassen", "Yacine Jsaispasquoi");
    }

    @GetMapping("/{id}") // GET http://localhost:8080/api/students/x
    public String getOneStudent(@PathVariable int id) {
        return "Vous cherchez l'étudiant portant l'id : " + id;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return student;
    }

    @DeleteMapping("/{id}")  // Delete http://localhost:8080/api/students/x
    public String deleteStudent(@PathVariable int id) {
        return "Vous cherchez a supprimer l'étudiant portant l'id : " + id;
    }

    @PutMapping("/{id}")  // Put http://localhost:8080/api/students/x
    public String updateStudent(@PathVariable int id) {
        return "Vous cherchez a modifier l'étudiant avec l'id : " + id;
    }

}

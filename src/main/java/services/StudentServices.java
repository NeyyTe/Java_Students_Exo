package services;

import models.Student;

import java.util.List;

public interface StudentServices {

    List<Student> getAllStudents();

    Student getOneStudent ( int id);

    Student create (Student student);

    Student delete (Student student);

    Student put (Student student);
}

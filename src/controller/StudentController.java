package controller;

import model.Student;
import service.StudentService;

public class StudentController {
    StudentService studentService = new StudentService();

    public Student[] findAll() {
        return studentService.findAll();
    }

    public void find(int index) {
        studentService.find(index);
    }

    public void add(Student student) {
        studentService.add(student);
    }

    public void replace(Student student, int index) {
        studentService.replace(student, index);
    }

    public void remove(int index) {
        studentService.remove(index);
    }
}

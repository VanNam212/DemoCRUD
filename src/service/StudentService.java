package service;

import model.Student;
import repository.StudentRepository;

public class StudentService implements GeneralService<Student> {
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void find(int index) {
        studentRepository.find(index);
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void replace(Student student, int index) {
        studentRepository.replace(student, index);
    }

    @Override
    public void remove(int index) {
        studentRepository.remove(index);
    }
}

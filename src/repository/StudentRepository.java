package repository;

import model.Student;

import java.util.Arrays;

public class StudentRepository implements GeneralRepository<Student> {
    Student[] students = new Student[20];
    private int size = 2;

    {
        students[0] = new Student(1, "Nguyen Van Nam");
        students[1] = new Student(2, "Nguyen Thi Hoai Anh");
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void find(int index) {
        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
            System.out.println("index: " + index + ", size: " + size);
        } else {
            System.out.println(students[index]);
        }
    }

    @Override
    public void add(Student student) {
        if (size == students.length) {
            int newSize = students.length * 2;
            students = Arrays.copyOf(students, newSize);
        }
        students[size++] = new Student(student.getId(), student.getName());
    }

    @Override
    public void replace(Student student, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Chi so khong ton tai");
        } else {
            students[index].setId(student.getId());
            students[index].setName(student.getName());
            System.out.println("Complete");
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Chi so khong ton tai");
        } else {
            for (int i = index; i < size - 1; i++) {
                students[i].setId(students[i + 1].getId());
                students[i].setName(students[i + 1].getName());
            }
            size--;
            students = Arrays.copyOf(students, size);
            System.out.println("Complete");
        }
    }
}

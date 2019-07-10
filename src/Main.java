import controller.StudentController;
import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        int choice;
        do {
            menu();
            System.out.println("Nhap vao lua chon:");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1: {

                    Student[] students = studentController.findAll();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println("ID: " + students[i].getId() + " NAME: " + students[i].getName());
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhap ID: ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println("Nhap ten: ");
                    String name = new Scanner(System.in).nextLine();
                    Student student = new Student(id, name);
                    studentController.add(student);
                    break;
                }
                case 3: {
                    System.out.println("Nhap vi tri can tim: ");
                    int index = new Scanner(System.in).nextInt();
                    studentController.find(index);
                    break;
                }
                case 4: {
                    System.out.println("Nhap vi tri can thay doi: ");
                    int index = new Scanner(System.in).nextInt();
                    System.out.println("Nhap ID: ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.println("Nhap ten: ");
                    String name = new Scanner(System.in).nextLine();
                    Student student = new Student(id, name);
                    studentController.replace(student, index);
                    break;
                }
                case 5: {
                    System.out.println("Nhap vi tri can xoa: ");
                    int index = new Scanner(System.in).nextInt();
                    studentController.remove(index);
                    break;
                }
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("\n");
        System.out.println("-----Quan ly sinh vien-----");
        System.out.println("1. Hien thi tat ca sinh vien");
        System.out.println("2. Them sinh vien");
        System.out.println("3. Tim kiem 1 sinh vien");
        System.out.println("4. Thay doi thong tin sinh vien");
        System.out.println("5. Xoa 1 sinh vien");
        System.out.println("0. Thoat");
    }
}

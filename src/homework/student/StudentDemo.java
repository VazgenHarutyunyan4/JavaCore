package homework.student;

import java.util.Scanner;

public class StudentDemo {


    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all students");
            System.out.println("please input 3 for delete student by index");
            System.out.println("please input 4 for print student by lesson");
            System.out.println("please input 5 for print students count");
            System.out.println("please input 6 for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    studentStorage.print();
                    System.out.println("please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.deleteByIndex(index);
                    break;
                case 4:
                    System.out.println("Please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentByLesson(lessonName);
                    break;
                case 5:
                    System.out.println("students count");
                    System.out.println(studentStorage.getSize());
                    break;
                case 6:
                    changeStudentLessonName();

                default:
                    System.out.println("invalid command");

            }
        }

    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if(student == null){
            System.out.println("Wrong Index!!!");
        }else {
            System.out.println("please input new lesson name");
            String newLessonName = scanner.nextLine();
            student.setLesson(newLessonName);
            System.out.println("lesson name changed");
        }
    }

    private static void addStudent() {
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lessonName);
        studentStorage.add(student);
        System.out.println("student created");
    }
}

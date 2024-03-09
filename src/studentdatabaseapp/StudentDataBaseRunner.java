package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseRunner {
    public static void main(String[] args) {

        //Ask how many students you want to add;
        System.out.println("Enter number of students you want to enroll");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create that number of students
        for (int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());


        }


    }
}

package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    static Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static final int COST_OF_COURSE = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student() {
        System.out.println("-------------");
        System.out.println("Enter students' first name");
        do {
            this.firstName = scanner.nextLine().trim();
            if (this.firstName.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter again:");
            } else if (this.firstName.matches(".*\\d.*")) {
                System.out.println("Input cannot contain numbers. Please enter again:");
            } else {
                break;
            }
        } while (true);


        System.out.println("Enter students' last name");
        do {
            this.lastName = scanner.nextLine().trim();
            if (this.lastName.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter again:");
            } else if (this.lastName.matches(".*\\d.*")) {
                System.out.println("Input cannot contain numbers. Please enter again:");
            } else {
                break;
            }
        } while (true);

        studentYear();
        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
/*      System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter students' class level");
        this.gradeYear = scanner.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);*/


    }

    public void studentYear() {
        System.out.println("-------------");
        do {
            try {
                System.out.println("Enter student's class level: \n1.Freshmen\n2.Sophomore\n3.Junior\n4.Senior");


                this.gradeYear = Integer.parseInt(scanner.nextLine());

                switch (gradeYear) {
                    case 1:
                        System.out.println("Freshmen");
                        break;
                    case 2:
                        System.out.println("Sophomore");
                        break;
                    case 3:
                        System.out.println("Junior");
                        break;
                    case 4:
                        System.out.println("Senior");
                        break;
                    default:
                        System.out.println("Please enter a valid grade year (1 - 4).");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the grade year.");
                continue;
            }

            // Break the loop if the input is valid
            if (gradeYear >= 1 && gradeYear <= 4) {
                break;
            }
        } while (true);




       /* this.gradeYear = scanner.nextInt();

        switch (gradeYear) {
            case 1:
                System.out.println("Freshmen");
                break;
            case 2:
                System.out.println("Sophomore");
                break;
            case 3:
                System.out.println("Junior");
                break;
            case 4:
                System.out.println("Senior");
                break;
        }
        scanner.nextLine();*/


    }

    //Generate an ID
    private void setStudentId() {
        // Grade level + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll() {
        System.out.println("-------------");
        // Initialize variables to hold courses and tuition balance
        courses = "";
        tuitionBalance = 0;

        // Loop until the user quits
        while (true) {
            System.out.print("Enter course to enroll (Q to quit):");
            String course = scanner.nextLine();

            // If the user enters "Q", quit the loop
            if (course.equalsIgnoreCase("Q")) {
                break;
            }
            // Add the course and its cost to the enrolled courses and update the tuition balance
            courses += course + "\n";
            tuitionBalance += COST_OF_COURSE;
        }
        // Print out the enrolled courses and tuition balance
        System.out.print("Enrolled in:\n" + courses);
        System.out.println("Remaining tuition amount: $" + tuitionBalance);
    }


    //View balance
    public void viewBalance(){
        System.out.println("-------------");
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    public void payTuition(){
        System.out.println("-------------");
        viewBalance();
        System.out.println("Enter your payment");
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Pay tuition
    //Show status

    //Enroll in courses
    /*public void enroll() {
        //Get inside of loop, user hits 0 -> quit loop
        System.out.println("Enter course to enroll (Q) to quit.");
        String course = scanner.nextLine();
        if (!course.equals("Q")) {
            courses += "\n" + course;
            tuitionBalance += "\n" + COST_OF_COURSE;
        }


        System.out.println("Courses: " + courses);
        System.out.println("Tuition balance: "+ tuitionBalance);
    }


*/





    /*public void enroll() {
        //Get inside a loop, user hits 0
        System.out.println("Select the courses you want to enroll.\n1.Math\n2.Computer Sci\n3.Literature\n0.To Quit");
        int choice;


        do {


            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Math");
                    break;
                case 2:
                    System.out.println("Computer Sci");
                    break;
                case 3:
                    System.out.println("Literature");
                    break;
                default:
                    System.out.println("Geçersiz seçim");
                case 4:
                    choice = scanner.nextInt();
                case 0:
                    choice = 0;
            }

        } while (choice != 0);
    }*/


















/*    static Scanner scanner = new Scanner(System.in);

    public String name;
    public String ID;
    public String coursesEnrolled;
    public int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(String coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public static String addStudent(int number){
        System.out.println("Enter the student numbers you want to add");
        number = scanner.nextInt();
    }*/
}

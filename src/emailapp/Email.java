package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private final int DEFAULT_PASSWORD_LENGHT = 10;
    private String email;
    private final String COMPANY_SUFFIX = "company.com";

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        //Call a method asking for the department - return department
        this.department = setDepartment();
        System.out.println("Department is " + this.department);

        //Call a method that returns a random password

        this.password = randomPassword(DEFAULT_PASSWORD_LENGHT);
        System.out.println("Your password is " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "" + lastName.toLowerCase() + "@" + department + "." + COMPANY_SUFFIX;
        System.out.println("Your email is " + email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1.Sales\n2.Development\n3.Accounting\n0.None\nEnter department code");
        String departmentName;
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        switch (departmentChoice) {
            case 1:
                departmentName = "Sales";
                break;
            case 2:
                departmentName = "Development";
                break;
            case 3:
                departmentName = "Accounting";
                break;
            case 0:
                departmentName = "None";
                break;
            default:
                System.out.println("Invalid department code. Please try again.");
                departmentName = setDepartment(); // Recursively call setDepartment() until a valid department code is entered
                break;
        }
        return departmentName;
    }


// Generate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGGHIJKLMNOPRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {this.mailboxCapacity = mailboxCapacity;}

    // Set the alternate email
    public void setAlternateEmail(String alternateEmail) {this.alternateEmail = alternateEmail;}


    // Change the password
    public void changePassword() {this.password = password;}

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}

    public String getPassword(){return password;}

    public String showInfo(){
        return "Display name is " + firstName + " "+ lastName +
                " \\nCompany email " + email +
                " \\nMailbox capacity "+ mailboxCapacity+ "mb";
    }
}



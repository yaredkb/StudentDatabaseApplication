package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private  String lastName;
    private int gradeYear;
    private  String studentID;
    private String courses;
    private int tuitionBalance;
    private  static int costOfCourse= 600;
    private  static  int id = 1000;
    //constructor prompt user  to enter students name and year
    public  Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student First Name :         ");
        this.firstName = in.nextLine();

        System.out.println( "Enter Students Last Name :          ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen \n2 - Sophmore\n3 - Junior\n4 - senior\n Enter student class level: ");
        this.gradeYear = in.nextInt();
            setStudentID();


    }
    //generate ID
    private void  setStudentID(){
        //grade level + ID

    id++;
    this.studentID = gradeYear + "" + id;
    }
    //Enroll in courses
    public  void enroll(){
        do {


            System.out.print("Enter course to enroll (Q to quit ): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (! course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }while (1 != 0);


    }
    public  void viewBalance(){
        System.out.println("Your balance is : $ " + tuitionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $ ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank You for your payment of $ :" + payment);
        viewBalance();
    }
    public  String showInfo(){
        return  "Name: " + firstName + "" + lastName +
                "\nGrade Level: " + gradeYear+
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: "  + courses +
                "\nBalance: $ "+ tuitionBalance;
    }
}

package studentDatabaseApp;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.net.SocketPermission;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // ask how money new student add

        System.out.print("Enter number of new Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        //create n number of new student
        for (int n = 0; n < numOfStudent; n++) {

            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[0].toString());
        }



    }
}

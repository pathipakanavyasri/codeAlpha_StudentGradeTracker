import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        String topper = "";

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, marks));

            total += marks;

            if (marks > highest) {
                highest = marks;
                topper = name;
            }

            if (marks < lowest) {
                lowest = marks;
            }
        }

        double average = (double) total / n;

        System.out.println("\n===== STUDENT REPORT =====");

        for (Student s : students) {
            System.out.println("Name: " + s.name +
                    " | Marks: " + s.marks +
                    " | Grade: " + getGrade(s.marks));
        }

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);
        System.out.println("Topper        : " + topper);

        sc.close();
    }

    public static String getGrade(int marks) {

        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }
}
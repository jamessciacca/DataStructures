package Lab3;

import java.util.LinkedList;

import java.util.Scanner;

public class StudentsDemo {

    public static void main(String[] args) {

        Students s1 = new Students();

        Course c1 = new Course("CSC162", "1", "3", "");

        Course c2 = new Course("CSC236", "4", "3", "");

        Course c3 = new Course("HIS101", "2", "4", "");

        LinkedList<Course> l1 = new LinkedList<Course>();

        l1.add(c1);

        l1.add(c3);

        LinkedList<Course> l2 = new LinkedList<Course>();

        l2.add(c2);

        s1.addStudent("1111", l1);

        s1.addStudent("1234", new LinkedList<Course>());

        s1.addStudent("2357", l2);

        String flag = "true";

        Scanner sc = new Scanner(System.in);

        String choice = "";

        String id = "";

        String courseName = "";

        while (flag.equalsIgnoreCase("true"))

        {

            System.out.println(" What action would you like to implement? ");

            System.out.println(" 1: Show all Students");

            System.out.println(" 2: Add a Course");

            System.out.println(" 3: Drop a course");

            System.out.println(" 9: Quit");

            choice = sc.nextLine();

            switch (choice)

            {

                case "1":
                    s1.displayStudents();
                    break;

                case "2":

                    break;

                case "3":

                    System.out.println(" Enter student Id : ");

                    id = sc.nextLine();

                    System.out.println(" Enter course Name : ");

                    courseName = sc.nextLine();

                    s1.dropCourse(id, courseName);

                    break;

                case "9":
                    flag = "false";
                    break;

                default:
                    System.out.println("Please choose correct option ");

            }

        }

    }

}

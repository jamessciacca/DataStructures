package Lab3;

import java.util.ArrayList;

import java.util.LinkedList;

import java.util.List;

public class Students {

    private List<Student> studentList = new ArrayList<Student>();

    private List<Course> courseList = new ArrayList<Course>();

    private int setMaxNumberOfStudents;

    class Student {

        private String iD;

        private LinkedList<Course> courses;

        public Student() {

            super();

        }

        public Student(String iD, LinkedList<Course> courses) {

            super();

            this.iD = iD;

            this.courses = courses;

        }

        public String getiD() {

            return iD;

        }

        public void setiD(String iD) {

            this.iD = iD;

        }

        public LinkedList<Course> getCourses() {

            return courses;

        }

        public void setCourses(LinkedList<Course> courses) {

            this.courses = courses;

        }

        public void addCourse(Course c)

        {

            this.courses.add(c);

        }

        public void dropCourse(String cName)

        {

            Course c = new Course();

            for (Course course : courses) {

                if (course.getCourseName().equalsIgnoreCase(cName))

                {

                    c = course;

                    break;

                }

            }

            courses.remove(c);

        }

        @Override

        public String toString() {

            String coursArr = " ";

            for (Course course : courses) {

                coursArr = coursArr + course + " ";

            }

            return iD + " " + coursArr;

        }

    }

    public Students() {

    }

    public void displayStudents()

    {

        for (Student std : studentList) {

            System.out.println(std.toString());

        }

    }

    public void addStudent(String id, LinkedList<Course> courses)

    {

        studentList.add(new Student(id, courses));

    }

    public void addCourse(Student s, Course c)

    {

        s.addCourse(c);

    }

    public void dropCourse(String s, String cName)

    {

        Student s1 = new Student();

        for (Student st : studentList) {

            if (st.getiD().equalsIgnoreCase(s))

                s1 = st;

        }

        s1.dropCourse(cName);

    }

}

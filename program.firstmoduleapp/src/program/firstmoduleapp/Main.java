package program.firstmoduleapp;

import program.secodmoduledatabase.Course;
import program.secodmoduledatabase.CourseServer;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        CourseServer courseServer = new CourseServer();

        List<Course> courses = courseServer.getCourseList();

        for (Course course : courses) {
            System.out.println(course.getCourseAuthor() + " Course: " + course.getCourseName());
        }

    }
}

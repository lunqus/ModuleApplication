package program.firstmoduleapp;

import program.secodmoduledatabase.Course;
import program.secodmoduledatabase.CourseServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        CourseServer courseServer = new CourseServer();

        List<Course> courses = courseServer.getCourseList();

        for (Course course : courses) {
            System.out.println(course.getCourseAuthor() + " Course: " + course.getCourseName());
        }

        try {
            URL url = new URL("http://www.google.com");
            URLConnection urlConnection = url.openConnection();
            InputStream in;
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String inputLine;

            while((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }

            reader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

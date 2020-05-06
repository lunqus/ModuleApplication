package program.secodmoduledatabase;

import java.util.ArrayList;
import java.util.List;

public class CourseServer {

    public List<Course> getCourseList() {

        List<Course> courseList = new ArrayList<>();

        Course course = new Course();

        for (int i = 0; i < 10; i++) {
            course.setCourseName("Course Nr. " + i);
            course.setCourseAuthor("Author Nr. " + i);

            courseList.add(course);
        }

        return courseList;
    }
}

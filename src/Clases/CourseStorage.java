package Clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class CourseStorage {
    private Map<String, Course> courseMap = new HashMap<>();

    public CourseStorage(){
        Course course1 = new Course("1", "Javascript Essentials", " ", " ", 0, 0.0);
        Course course2 = new Course("2", "Python Essentials"," "," ", 0, 0.0);
        Course course3 = new Course("3", "Java from basic to intermediate", " ", " ", 0, 0.0);
        saveCourse(course1);
        saveCourse(course2);
        saveCourse(course3);
    }
    private void saveCourse(Course course) {
        courseMap.put(course.getId(), course);
        System.out.println(course.getId());
    }

    public void removeCourseById(String id) {
        if (courseMap.containsKey(id)) {
            courseMap.remove(id);
            System.out.println("Course removed with ID: " + id);
        } else {
            System.out.println("Course with ID: " + id + " not found");
        }
    }

    public Course getCourseById(String id) {
        return courseMap.get(id);
    }

    public void assignCourseToFolio(Course course, int folio) {
        System.out.println("***Your ticket*** Course " + course.getId() + " " + course.getTitle() + " has the purchasing Folio " + folio + " please keep it safe for clarification.");
    }

    public int generateFolio() {
        Random random = new Random();
        int folio = 0;
        for (int i = 0; i < 10; i++) {
            folio = folio * 10 + random.nextInt(10);
        }
        return folio;
    }
}
package Clases;

public class Course {
    private String title;
    private String description;
    private String professor;
    private int duration;
    private double price;

    public Course(String title, String description, String professor, int duration, double price) {
        this.title = title;
        this.description = description;
        this.professor = professor;
        this.duration = duration;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
/*
Implementación
        Course course = new Course("Introduction to Programming", "Learn the basics of programming", "John Doe", 10, 99.99);
        course.setTitle("Programming Fundamentals");
        course.setPrice(79.99);*/
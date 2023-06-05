package Clases;

import java.util.UUID;

public class Course {
    private String id;
    private String title;
    private String description;
    private String professor;
    private int duration;
    private double price;

    public Course(String id, String title, String description, String professor, int duration, double price) {
        this.id = id;
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

    public String getId(){
       UUID.randomUUID().toString();
       return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
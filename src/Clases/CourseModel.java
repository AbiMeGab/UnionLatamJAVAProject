package Clases;

public interface CourseModel extends UserModel {
    String getTitle();

    void setTitle(String title);

    String getDescription();

    void setDescription(String description);

    String getProfessor();

    void setProfessor(String professor);

    int getDuration();

    void setDuration(int duration);

    double getPrice();

    void setPrice(double price);
}
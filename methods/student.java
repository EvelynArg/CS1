public class student{
    String name;
    double marks;

    public void displayinfo(){
        System.out.println("Student´s names is: " + name);
        System.out.println("Marks: " + marks);
    }

    public void addmarks(int points){
        marks = marks + points;
    }
}
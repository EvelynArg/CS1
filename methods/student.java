public class student{
    String name;
    double marks;

    public void displayinfo(){
        System.out.println("Student´s names is: " + name + "; Marks: " + marks);
    }

    public void addmarks(int points){
        marks += points;
    }

    public void study(){
        addmarks(5);
    }
}
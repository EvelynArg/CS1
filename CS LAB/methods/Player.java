package methods;
public class Player{
    public static void main(String[] args) {
        objectPractice p1 = new objectPractice();
        p1.name = "John";
        p1.score = 0;
        p1.displayinfo();
        p1.addscore(10);
        p1.displayinfo();
    }
}

class objectPractice{
       //atributes
    String name;
    int score;

    public void displayinfo(){
        System.out.println("Player´s name is: " + name + "; Score: " + score);
    }
    public void addscore(int points){
        score += points;
    }

}

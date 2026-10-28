public class teacher {
    String name, subject;

    public void introduce(){
        System.out.println("Teacher´s name is: " + name + "; Subject: " + subject);
    }

    public void giveBonusMarks(student s, int points){
        s.addmarks(points);
    }

}

public class main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Alice";
        s1.marks = 70;

        teacher t1 = new teacher();
        t1.name = "Mr. Smith";
        t1.subject = "Math";

        s1.displayinfo();
        s1.study();
        t1.introduce();

        t1.giveBonusMarks(s1, 15);
        s1.displayinfo();
    }
}

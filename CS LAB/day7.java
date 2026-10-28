public class day7 {
        public static void main(String[] args) {
            //PROBLEM 1 
             
        int age = 19;

        if (age<13) {
            System.out.println("Chil ticket " );
        } else if (age>=13 && age <= 64) {
            System.out.println("Adult ticket" );
        } else {
            System.out.println("Senior Ticket");
        }

        //Problem 2 
        int level = 2;
        if (level == 1) {
            System.out.println("Beginner");
        } else if (level == 2) {
            System.out.println("Intermediate"); 
        } else {
            System.out.println("Advanced");
        }

        //What will the program output? Intermediate 
        // Which condition is true? level == 2
        // Why does Java not print any of the other messages? Because the condition level == 2 is true, so the corresponding block executes and the rest are skipped.
        // What would the output be if level changed to 1? Beginner

        //Practice 3 TRUE OR FALSE 
        System.out.println(5 > 3);//true
        System.out.println(10==7);//false
        System.out.println(8!=4);//true
        System.out.println(6<=6);//true
        System.out.println(2>9);//false
    }
}

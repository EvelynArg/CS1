import java.util.Scanner; //import the Scanner class object

public class scanner {
    public static void main(String[] args) {
        Scanner scannerobj=new Scanner(System.in); //create a Scanner object to read input from the user

        System.out.println("Enter your email: "); //prompt the user to enter their email
        String email = scannerobj.nextLine(); //read the user's input as a string
        System.out.println("Your email is: " + email); //display the user's email
    }
}
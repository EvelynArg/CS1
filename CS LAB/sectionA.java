import java.util.Scanner;
public class sectionA {
    public static void main(String[] args) {
        // int choice_route = 1;
        // switch (choice_route) {
        //     case 1:
        //         System.out.println("You have selected Route Library.");
        //         break;
        //     case 2:
        //         System.out.println("You have selected Route Stadium.");
        //         break;
        //     case 3:
        //         System.out.println("You have selected Route Downtown.");
        //         break;
        //     default:
        //         System.out.println("Invalid choice. Please select a valid route.");
        //         break;
        // }

        // //Library return book

        // int date = 15;
        // double fine=3.00;
        // boolean isMember = false;

        // if (date > 6 && !isMember) {
        //     fine = 3.00;
        //     System.out.println("You have exceeded the return date. A fine will be applied." +
        //             " The fine amount is: $" + fine);
        // } else if (date > 6 && isMember) {
        //     fine = 1.50;
        //     System.out.println("You have exceeded the return date. A fine will be applied." +
        //             " The fine amount is: $" + fine);
        // } else if (date > 0 && date <= 6) {
        //     System.out.println("You have returned the book on time. No fine will be applied.");
        // } else {
        //     System.out.println("Invalid return date.");
        // // }
        // Scanner scanner = new Scanner(System.in);
        // int goal = 100;
        // double total = 0;
        // int week = 1;
        // while (total < goal) {
        //     System.out.println("Enter the amount saved in week " + week + ":");
        //     double savesMoney = scanner.nextDouble();
        //     total += savesMoney;
        //     week++; 
        // }
        // System.out.println("Goal reached! Total saved: $" + total);

        // int rows = 3;
        // int cols = 5;

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if ((i + j) % 2 == 0) {
        //             System.out.print("X ");
        //         } else {
        //             System.out.print("O ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int count = 6;
        // int sum = 0;

        // System.out.print("Triangular numbers: ");
        // for (int i = 1; i <= count; i++) {
        //     int triangularNumber = (i * (i + 1)) / 2;
        //     System.out.print(triangularNumber + " ");
        //     sum += triangularNumber;
        // }
        // System.out.println("\nSum: " + sum);

        int choice = 2;



switch (choice) {

  case 1:

    System.out.println("Coffee");


    break;
  case 2:

    System.out.println("Tea");



  case 3:

    System.out.println("Hot Chocolate");



  default:

    System.out.println("Invalid selection");

}



    }
}

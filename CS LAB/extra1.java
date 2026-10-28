import java.util.Scanner;
public class extra1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pricePoint = -1;

            while (pricePoint < 0) {
                System.out.print("How much are you looking to spend?");

                pricePoint = sc.nextInt();

                if (pricePoint < 0) {
                    System.out.println("Hey.. are you okay? you can't pay negative numbers...");
                }else {
                    System.out.println("Thank you! Anwswer a few for more questions about what you're  in the mood to spend: " + pricePoint);
                }


            int n=1234;
            boolean prime=false;

            if(n%2==0){
                System.out.println(prime=true);
            }

            int a =1;
            int b=5;

            while(a<b){
                System.out.println(a + b + " ");
                a++;
                b--;
            }
            System.out.println( a + " " + b );

        }
    }
}
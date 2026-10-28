public class day10 {
    public static void main(String[] args) {
        int sum=0;
        for (int i =2; i <=20; i+=2) {
                System.out.print("" + i + " + ");
                sum += i;
        }
        System.out.println("\n Sum of even numbers from 2 to 20 is: " + sum);


        System.out.println("\n ---------------");
        int sum2=0;
        for (int i =1; i <=10; i++) {
                System.out.print("" + i + " + ");
                sum2 += i;
        }
        System.out.println("\n Sum of numbers from 1 to 10 is: " + sum2);
    }
}
public class loops {
    public static void main(String[] args) {
        // Example of a for loop 
        System.out.println("---------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
        // Pratice 2
        System.out.println("---------------------------");
        for (int i =1; i <=20; i++) {
                int even = i % 2;
                if (even == 0) {
                    System.out.println("Even Number: " + i);
                }
        } 
        
        System.out.println("------");
        for (int i =2; i <=20; i+=2) {
                System.out.println("Even Number: " + i);
        }
        //Practice 3 
        System.out.println("---------------------------");
        for (int i =1; i <=30;i++){
            int divisibleBy3 = i % 3;
            int divisibleBy5 = i % 5;

            if (divisibleBy3 == 0 && divisibleBy5 == 0) {
                System.out.println("Divisible by 3 and 5: FizzBuzz " + i);
            } else if (divisibleBy5 == 0) {
                System.out.println("Divisible by 5: Buzz " + i);
            } else if (divisibleBy3 == 0) {
                System.out.println("Divisible by 3: Fizz " + i);
            }else{
                System.out.println(i);
            }
        }
        //Practice 4
        System.out.println("---------------------------");
        int input=10;
        int count = 1;
        for (int i = 1; i <= input; i++) {
            count = count*i;
        }
        System.out.println("Factorial of " + input + " is: " + count);

        //Practice 5
        int input2 = 10;
        for (int i = 0; i <= input2; i+=1) {
             System.out.println(i*3);
        }




        
       
    }
}


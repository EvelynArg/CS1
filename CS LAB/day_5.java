public class day_5 {
    public static void main(String[] args) {
        //Problem 1 
        int x=12;
        int y=5;
        //Operations
        int sum=x+y;
        int difference=x-y;
        int product=x*y;
        int quotient=x/y;
        int remainder=x%y;
        int square_Sum=x*x+y;
        //Prints
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient  is: " + quotient);
        System.out.println("The remainder is: " + remainder);
        System.out.println("The square x and add y is: "+ square_Sum);
        
        System.out.println("");
        //Problem 2 
        
        int a = 14;
        int b = 5;

        System.out.println(a + b * 2); // 24
        System.out.println((a + b) * 2); // 38
        System.out.println(a > b);// true
        System.out.println(a == b);// false
        System.out.println(a != b);// true
        System.out.println(a + 2 > b * 3);// true
        System.out.println(a % 3 == 2);// true

        //Problem 3
        //What is a JAVA expression and how operators and operands work together for given a results?
        //A Java expression is a combination of variables, operators, and method calls that are evaluated to produce a single value. 
        // Operators perform operations on operands (the values or variables) to yield a result. 
        // For example, in the expression `a + b`, `a` and `b` are operands, and `+` is the operator that adds them together to produce a result.

        //Example of a Java expression:
        int num1 = 10;
        int num2 = 5;
        int result = num1 * num2 + 2; 
        
        // Operands: num1 and num2
        // Operators: * and +
        // Result: 52

    }
}

public class cube {
    
    public static void main(String[] args) {

        System.out.println("The sum of two squares is: " + sumSquare(11, 13));        
        System.out.println("The cube of is: " + cube(13));

        System.out.println("The cube of the sum of two squares is: " + cube(sumSquare(11, 13)));
    }

    static int cube(int num) {
        return num * num * num;
    }

    static int sumSquare(int a, int b){
        return (a * a) + (b * b);
    }
}

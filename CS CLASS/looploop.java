public class looploop {
    public static void main(String[] args) {
        //PRACTICE 1
        int n=6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //PRACTICE 2
        String hello="hello";

        int index = hello.length();
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hello.charAt(i));
        }


    }
}

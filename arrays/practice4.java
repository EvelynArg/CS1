public class practice4 {
    public static void main(String[] args) {
        int[] temperatures = {72, 85, 68, 91, 77};
        int max = temperatures[0];
        for (int temp: temperatures) {
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("Maximum temperature: " + max);

    }
}

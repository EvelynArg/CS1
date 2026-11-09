public class arraymax {
    public static void main(String[] args) {
        int[] arr = {78, 92, 85, 64, 91};
        int max = arr[0];
        //for loop
        for(int i =0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("For loop Max Value: " + max);
        // for each loop
        max = arr[0]; // Reset max for the for-each loop
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("For each loop Max Value: " + max);
    }
}

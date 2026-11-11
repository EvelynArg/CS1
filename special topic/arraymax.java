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

        // Using the maxValue method
        int[] arr2 = {101010, 2131234, 32443, 76767, 28324, 72468, 13172, 72728, 21736};
        int[] arr3={78, 92,85,64,91};
        maxValue(arr2);
        minValue(arr2);
        samevalue(arr3, 92);
    }







    static int maxValue(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println("Max Value from maxValue method: " + max);
        return max;
    }

    static int minValue(int[] value){
        int min= value[0];
        for (int v : value){
            if (v<min){
                min = v;
            }
        }
        System.out.println("Min Value from minValue method: " + min);
        return min;
    }

    static int samevalue(int[] values, int target){
        int count=0;
        for (int v:values){
            if (v==target){
                count++;
            }
        }
        System.out.println("Count the number times " + target + " appears in the array: " + count);
        return count;
    }

    static int index(int[] values, int target){
        int index=-1;
        for (int i=0;i<values.length;i++){
            if(values[i]==target){
                index = i;
            }
        }
        return index;
    }
}

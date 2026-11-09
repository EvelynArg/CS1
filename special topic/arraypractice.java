public class arraypractice {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5,6};

        //Print the length of the array
        System.out.println(numbers.length);
        //Print the first element of the array
        System.out.println(numbers[0]);
        //Print the last element of the array
        System.out.println(numbers[5]);
        //int[] numbers = {1, 2, 0, 4, 5,6};
        numbers[2] = 0;
        //Print the last index of the array
        System.out.println(numbers.length-1);
        //Print all the elements of the array using a for each loop
        for (int number: numbers){
            System.out.println(number);
        }
        //Sum all the elements of the array using a for each loop
        int sum = 0;
        for (int number: numbers){
            sum += number;
        }
        System.out.println(sum);
    }    
}

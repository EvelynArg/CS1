public class practice5 {
    public static void main(String[] args){
// Problem 1:
// Use one loop to find the highest and lowest score. Print both, then print the range (highest minus lowest).
        int [] numbers = {65, 92, 78, 88, 54, 97,23,34,23,35,45,42};
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int number: numbers){
            if (number > highest){
                highest = number;
            }
            if (number < lowest){
                lowest = number;
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Range: " + (highest - lowest));
// Problem 2:
// Create a new array called curved that is the same size as scores. Fill it with each score plus 5, but no score can go above 100. Print the curved scores on one line.
// Use the code snippet below to get started
        int[] scores = {65, 92, 78, 88, 54, 97};
        int[] curved = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            curved[i] = scores[i] + 5;
            if (curved[i] > 100) {
                curved[i] = 100;
            }
        }

        System.out.print("Curved scores: ");
        for (int score : curved) {
            System.out.print(score + " ");
        }
    }
}

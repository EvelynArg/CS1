public class Day_4 {
    public static void main(String[] args) {

        //Problem 1
        int favoriteNumber = 8;
        int square = favoriteNumber * favoriteNumber;
        System.out.println("My favorite number squared is: " + square);

        //Problem 2
        String movie = "In Time";
        int year = 2011;
        int yearsAgo = 2026 - year;
        char firstLetter = movie.charAt(0);
        System.out.println("My favorite movie is "+ movie);
        System.out.println("It was released in " + year + " which is " + yearsAgo + " years ago");
        System.out.println("My favorite movie is " + movie + " and it was released in " + year + " which is " + yearsAgo + " years ago. And the first letter of the movie is " + firstLetter + ".");

    }
}

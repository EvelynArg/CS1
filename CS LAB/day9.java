public class day9 {
    public static void main(String[] args) {
        String fav_genre_book="reflexion";
        switch (fav_genre_book) {
            case "fantasy":
                System.out.println("I recommend you: A Game of Throne!");
                break;
            case "science fiction":
                System.out.println("I recommend you: Animal Farm!");
                break;
            case "romantic":
                System.out.println("I recommend you: White Knight");
                break;
            case "reflexion":
                System.out.println("I recommend you: Man's Search for Meaning!");
                break;
            default:
                System.out.println("This genre is not recognized. Choose another genre");
                break;
        }
    }
}

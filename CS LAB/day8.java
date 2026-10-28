public class day8 {
    public static void main(String[] args) {
        //Exercise
        int rating =7;
        boolean hasSubscription=true;
        
        if(rating>=8) {
            if (hasSubscription) {
                System.out.println("Watch the movie");
            } else {
                System.out.println("Rent the movie");
            }
        }else if (rating>=5 && rating<8) {
            if(hasSubscription){
                System.out.println("watch if you want");
            } else {
                System.out.println("Find another movie");
            }
        }
        else {
            System.out.println("Choose a different movie ");
        }
    } 
}
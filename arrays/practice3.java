public class practice3 {
    public static void main(String[] args){

        //Problem 1
        String[] myPets={"Atenea","Kia", "Freya", "Tizzy", "Pamela", "Guaya", "Wero", "Max", "Ladron", "Cojo", "Wero2"};
        int x=0;
        for (String pet: myPets){
            System.out.println("Pet "+x+": "+pet);
            x++;
        }
        //Problem 2
        int[] scores={88,72,95,64,79};
        int count=0;
        for(int s:scores){
            if (s>75){
                count++;
            }
        }
        System.out.println("Number above 75: "+count);


    }
    
}

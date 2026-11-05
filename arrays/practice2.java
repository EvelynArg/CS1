public class practice2 {
    public static void main(String[] args){
        String[] foods={"Mole","Burritos","PolloFrito","Chocolate","Fresas"};
        System.out.println(foods[0]);
        System.out.println(foods[foods.length-1]);

        for(String food: foods){
            System.out.println(food);
        }
    }    
}

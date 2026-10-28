public class practice {
    public static void main(String[] args) {
       double order=80;
       boolean member=false;
       double  free_shipping=7.99; //10 dollars

        if(order>=50 && member) {
            System.out.println("total cost: " + order + "\n Free shipping applied.");
        }else if (order>=100) {
            System.out.println("total cost: " + order + "\n Free shipping applied.");
        }else {
            System.out.println("total cost: " + (order+free_shipping) + "\n Free shipping not applied.");
       }

       int select = 3;
       
       switch(select) {
           case 0:
               System.out.println("Option 0: Coffee.");
               break;
           case 1:
               System.out.println("Option 1: Tea.");
               break;
            case 2:
               System.out.println("Option 2: Juice.");
               break;
            case 3:
               System.out.println("Option 3: Water.");
               break;
            case 4:
               System.out.println("Option 4: Soda.");
               break;
           default:
               System.out.println("Invalid option.");
               break;
       }
    }
}
public class practice_str {
    public static void main(String[] args) {
        String name = "Evelyn";
        String email_ID= "eiperezmartine@utep.edu";
        
        String reach1 = "You can reach " + name + " at " + email_ID;
        System.out.println(reach1);
        System.out.println("You can reach " + name + " at " + email_ID);

        String reach = name.concat(email_ID);
        System.out.println(reach);

        //Return position 5 
        System.out.println(reach1.charAt(5));

        boolean result = reach1.charAt(5) == 'n';
        System.out.println(result);

        System.err.println("ANSWER: "+(3+5));

    }
}

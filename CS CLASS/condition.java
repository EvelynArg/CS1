public class condition {
    public static void main(String[] args) {
        // boolean rain = true;
        // if (rain) {
        //     System.out.println("Take a umbrella");
        // } else {
        //     System.out.println("Go");
        // }

        //Practice 2
        // boolean isRaining = true;
        // boolean isCold = true;
        // if (isRaining) {
        //     System.out.println("Take a umbrella");
        // } else if (isCold) {
        //     System.out.println("wear a jacket");
        // } else{
        //     System.out.println("Go");
        // }

        //Practice 3
        // boolean r = false;
        // boolean c = false;
        // if (r) {
        //     System.out.println("Take a umbrella");
        // } else if (c) {
        //     System.out.println("wear a jacket");
        // } else if (r && c){
        //     System.out.println("Take a umbrella and wear a jacket");
        // }else{
        //     System.out.println("Go");
        // }

        //practice 4 
        // int temperature = 72;
        // boolean raining = false, parkIsOpen=true;

        // if (temperature >= 60 && temperature <= 85 && !raining && parkIsOpen) {
        //     System.out.println("Go the park! The temperature is: " + temperature);
        // } else if (raining && parkIsOpen) {
        //     System.out.println("Bring an umbrella. Temperature: " + temperature);
        // } else {
        //     System.out.println("Stay home");
        // }

        //practice 4 
        // int age = 12;

        // if (age<12) {
        //     System.out.println("Children price: 8" );
        // } else if (age >= 65) {
        //     System.out.println("Adult price: 10" );
        // } else {
        //     System.out.println("Regular price: 15");
        // }

        //practice 5
        String pin = "7878", pin_request="7878";
        int funds = 200;
        int request =300; 

        if (pin_request==pin) {
            if (request <= funds) {
                System.out.println("Withdrawal approval" );
            } else{
                System.out.println("insufficient funds" );
            }     
        } else {
            System.out.println("Incorrect Pin");
        }
    }
}

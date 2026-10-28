public class function {

    public static String mensaje(String name){
        String message = "Hola Bienvenido a Campus Cafe " + name;
        System.out.println(message);
        return message;
    }
    public static void main(String[] args) {
            mensaje("Melanie");
            mensaje("Evelyn");
    }
}
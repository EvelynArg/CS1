import java.util.Scanner;
// INI------NEW CLASS CLASE DE MENU ITEM
//Clase para representar cada producto del menú
class MenuItem {

    String name;
    double price;

    // Constructor, en el contructor solo guardamos los objetos que creamos en el main, y ya los tenemos con nombre y valores parareferenciarlos en las demas clases y functiones.
    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Método que regresa el nombre del producto, 
    String getName() {
        return name;
    }

    // Método que regresa el precio del producto
    double getPrice() {
        return price;
    }
}
// END------NEW CLASS CLASE DE MENU ITEM


// INI------NEW CLASS CLASE DE ORDER
// Clase para representar la orden del cliente
class Order {

    double total;

    // Arrays para guardar los productos y cantidades,cremos dos array para guardar valores de los productos como nombre y precio. y creamos uno para guardar la contidad de cada profucto que se compra. 
    MenuItem[] items = new MenuItem[20];
    int[] quantities = new int[20];

    int itemCount = 0;

    //Este es nuestro contructor de la clase que lo que hace es que solo imprimira el total de todo los prductors multiplicados por su contidad. 
    Order() {
        total = 0;
    }

    // Agrega un producto a la orden cuando el if del main de cumple que es que la variable de select ITEM tenga un objeto como valor de referencia. 
    void addItem(MenuItem item, int quantity) {

        //creamos una variable para definir el costo utilizando la cantidad y ademas el preco del objeto con el atributo getPrice
        double itemCost = item.getPrice() * quantity;

        total = total + itemCost;//Lo sumamos al total . 

        // Guardar el producto, guardamos el producto en el array 
        items[itemCount] = item; 

        // Guardar la cantidad cantidad en el arrey
        quantities[itemCount] = quantity;

        itemCount++;//sumamos las veces que el usuario compra. 
    }

    //retorna el total de que se actualizo en la funcion addItem. 
    double getTotal() {
        return total;
    }

    // Método para imprimir el ticket
    void printTicket() {

        System.out.println("\n------ CAMPUS CAFE RECEIPT ------");

        for (int i = 0; i < itemCount; i++) {

            double itemTotal =items[i].getPrice() * quantities[i];

            System.out.println( items[i].getName() + " x " + quantities[i]+ " = $" + itemTotal);
        }
        // printf imprime el número con formato.
        // %.2f significa mostrar un número decimal con 2 decimales.

        System.out.printf("Total: $%.2f%n",total);

        System.out.println("-------------------------------");
    }
}
// END------NEW CLASS CLASE DE ORDER

// Clase principal
public class Campus_cafe_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Crear objetos MenuItem. (Estoy creando los obejtos del menu, con un contructor que solo tiene el numbre y el precio). 
        MenuItem pumpkinChai = new MenuItem("Pumpkin Chai", 6.77);
        MenuItem icedCoffee = new MenuItem("Iced Coffee", 4.56);
        MenuItem hotChocolate = new MenuItem("Hot Chocolate", 5.88);
        MenuItem matchaLatte = new MenuItem("Matcha Latte", 5.45);
        MenuItem blueberryMuffin = new MenuItem("Blueberry Muffin", 3.79);
        MenuItem chocolateChipCookie = new MenuItem("Chocolate Chip Cookie", 3.58);
        MenuItem bagel = new MenuItem("Bagel", 3.59);
        MenuItem fruitCup = new MenuItem("Fruit Cup", 6.30);

        // Crear objeto Order
        Order myOrder = new Order();

        String order = "yes";

        System.out.println("Welcome to Campus Cafe!");

        // Loop para permitir varias órdenes, Aqui se inicia el loop ¿como? el loop dice que order es igual que yes sigue, y como order lo declaramos por default en yes si va a iniciar el up. 
        while (order.equals("yes")) {

            // Mostramos el menú, que es la duncion static void. 
            menu();

            // Pedir selección, les decimos que seleccion un numero de 1 al 8. con un input que es int para comenzar con el switch
            System.out.print("Select an item (1-8): ");
            int selection = input.nextInt();

            // Variable para guardar el producto seleccionado, basicamento aqui creamos una variable que puede referenciar un objeto en especifo (como los objetos que creamos para MenuItem)
            MenuItem selectedItem = null;

            // Elegir producto usando switch
            switch (selection) {

                case 1:
                    // QUE PASA AQUI!!!? bueno la variable que creamos de tipo MenuItem, esta referencia un objeto que creamos y guarda los valores de ese obejto. en este caso que es lo que tiene el obketo, 
                    //el nombre y el precio espeficico de pumpikinChai.Igual con todas las demas. 
                    selectedItem = pumpkinChai;
                    break;

                case 2:
                    selectedItem = icedCoffee;
                    break;

                case 3:
                    selectedItem = hotChocolate;
                    break;

                case 4:
                    selectedItem = matchaLatte;
                    break;

                case 5:
                    selectedItem = blueberryMuffin;
                    break;

                case 6:
                    selectedItem = chocolateChipCookie;
                    break;

                case 7:
                    selectedItem = bagel;
                    break;

                case 8:
                    selectedItem = fruitCup;
                    break;
                
                default:
                    System.out.println( "Invalid selection. Please choose an item from the menu.");
                    break;
            }

            // Si la selección es válida, que quieree decir la funcion si selectITEM es diferente a null (como se declaro en default). quiere decir que tiene un valor que es la referencia de un objeto.
            if (selectedItem != null) {

                //vamos viendo que cantidad del porducto es lo que queire con un input. 
                System.out.print("Enter quantity: ");
                int quantity = input.nextInt();

                // Agregar el producto a la orde. mandamos a llamar a myOrder que es el objeto de mi clase Order, mandamos a llamar la funcion addItem, 
                myOrder.addItem(selectedItem, quantity);

                System.out.println(
                    selectedItem.getName() + " added to your order."
                );
            }

            // Limpiar el Enter pendiente de nextInt()
            input.nextLine();

            // Preguntar si desea seguir ordenando
            System.out.print("Do you want to order another item? yes/no: ");
            order = input.nextLine();
        }

        // Mostrar total final
        myOrder.printTicket();
        System.out.println("Thank you for visiting Campus Cafe!");

        input.close();
    }


    // Método para mostrar el menú, Es una funcion static void lo que quiere decir que le hace return a nada solo estamo sllamando la funcion e imprimiendo el menu.
    static void menu() {

        System.out.println("\n---- CAMPUS CAFE MENU ----");
        System.out.println("1. Pumpkin Chai - $6.77");
        System.out.println("2. Iced Coffee - $4.56");
        System.out.println("3. Hot Chocolate - $5.88");
        System.out.println("4. Matcha Latte - $5.45");
        System.out.println("5. Blueberry Muffin - $3.79");
        System.out.println("6. Chocolate Chip Cookie - $3.58");
        System.out.println("7. Bagel - $3.59");
        System.out.println("8. Fruit Cup - $6.30");
        System.out.println();
    }
}
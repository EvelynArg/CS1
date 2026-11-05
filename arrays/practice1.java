public class practice1 {
    public static void main(String[] args){
        //Create array 
        int[] num={0,1,2,3,4,5};
        //Print fist and last elements of the array
        System.out.println(num[0]);
        System.out.println(num[5]);
        //Aqui se suma los valores que hay dentro del array como si se tratarade de una suma de caracteres. 
        //A menos de que pongamos "" en medio de los valores, en ese caso se concatenan los valores.
        System.out.println(num[0] + num[1]);
        System.out.println(num[0] + "" + num[1]);
        //Aqui cambiamos el valor de la posicion 2 del array, que originalmente era 2, por el valor 6.
        num[2]=6;

        int sum=0;
        //For each loop, es un bucle que recorre todos los elementos de un array. Como si fuera un for loop. 
        //En este caso, n es el valor de cada elemento del array num.
        for(int n:num){
            System.out.println(n);
            sum+=n;
        }
        System.out.println("Sum: "+sum);
    }
}

class Counter { 

    int value; 

    public Counter(int start) { value = start; } 

    public void add(int n) { value += n; } 

} 

public class Main { 

    public static void change(int x) { x += 5; } 

    public static void main(String[] args) {

        Counter a = new Counter(4); 

        Counter b = new Counter(7); 

        a.add(3); 

        int x = a.value; 

        change(x); 

        b.add(x); 

        System.out.println("A: " + a.value); 

        System.out.println("B: " + b.value); 

        System.out.println("X: " + x); 

    } 

} 

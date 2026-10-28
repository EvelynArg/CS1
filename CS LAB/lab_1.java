public class lab_1{
    

    public static int larger_num(int a, int b){
        int c;
        if (a>b){
            c=a;
            return c;
        }else{
            c=b;
            return c;
        }

    }

    public static void main(String[] args){
        lab_1 number = new lab_1();
        
        System.out.println(larger_num(larger_num(4,9),7));
    }
}

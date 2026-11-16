public class arraysShallow {
    public static void main(String[] args){
        int[] a={1,2,3};
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" ");
        int[] b=a;
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" ");
        b[0]=10;
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" ");
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" ");
        int[] c =b;
        c[2]=8;
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" ");
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" ");
        System.out.println(c[0]+" "+c[1]+" "+c[2]+" ");
        a[1]=7;
        System.out.println(a[0]+" "+a[1]+" "+a[2]+" ");
        System.out.println(b[0]+" "+b[1]+" "+b[2]+" ");
        System.out.println(c[0]+" "+c[1]+" "+c[2]+" ");
    }
}

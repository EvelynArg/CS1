public class practice6{
    public static int countAbove(int[] values, int threshold){
        int count=0;
        for(int i=0;i<values.length;i++ ){
            if(values[i]>threshold){
                count++;
            }       
        }
    return count;
    }

    public static void main(String[] args) {
        int[] scores={70,85,90,60,95};
        int cutoff=80; 
        int count=countAbove(scores, cutoff);
        System.out.println(count);




    }


}
public class LinearSearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,88,18,81};
        index(array, 18);

        int[] scores={67,65,88,99,100,67};
        System.out.print(score(scores,70));
        
    }

    static int index(int[] values, int target){
        int index=-1;
        for (int i=0;i<values.length;i++){
            if(values[i]==target){
                index = i;
            }
        }
        return index;
    }
    
        static int score(int[] values, int target){
        int index=-1;
        for (int i=0;i<values.length;i++){
            if(values[i]>= target){
                index = i;
                break;
            }
        }
        return index;
    }
}

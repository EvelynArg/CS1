public class LinearSearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,88,18,81};
        index(array, 18);

        int[] scores={67,65,88,99,100,67};
        System.out.println(score(scores,70));

        int[] temperatures={72, 80,75,90,83};
        averange(temperatures);
        
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
    static void averange(int[] temp){
        int promedio=0, count=0;
        
        for(int t:temp){
           promedio+= t;
        }

        promedio=promedio/ temp.length;

        for (int tem: temp){
            if(promedio < tem){
                count++;
            }
        }
        System.out.print("Average: " + promedio + "\n Temperatures above average: " + count);
        
    }
}

public class day20 {
    public static void main(String[] args){
        int[][] scores = {
            {80, 90, 70},
            {95, 85, 90},
            {60, 78, 87}
        };
        //PROBLEM 1
        //Each row is a student and each column is a test. Use nested loops to print each student's average (Student 0 average: 80.0, and so on)

        for(int r=0;r<scores.length;r++){
            double promedio=0;
            for(int c=0;c<scores[r].length;c++){
                promedio+=scores[r][c];
            }
            System.out.println("Student: "+r+ " Average: " + promedio/scores[r].length);
        }
        //PROBLEM 2
        //Find which test (column) has the highest total and print the column and its total. For these scores the answer is column 1 (253).
        int maxV=0, maxC=0;
        for (int c = 0; c < scores[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < scores.length; r++) {
                sum += scores[r][c];
            }
            if (sum > maxV) {
                maxV = sum;
                maxC = c;
            }
        }
        System.out.println("Column " + maxC + " has the highest total: " + maxV);
    }
}

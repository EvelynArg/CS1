public class arrayofarray {
    public static void main(String[] args){
        // int[][] seats={
        //     {1,0,1},
        //     {0,0,1}
        // };

        // int occupied=0;
        // int empty =0;

        // String[][] s= new String[2][3];
        
        // for(int r=0;r<seats.length;r++){
        //     for(int c=0;c<seats[0].length;c++){
        //         if(seats[r][c]==1){
        //             s[r][c]= "Occupied";
        //             occupied++;
        //         }else{
        //             s[r][c]= "Empty";
        //             empty++;
        //         }
        //         System.out.print(s[r][c]+ " ,");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("\nOccupied: " + occupied);
        // System.out.println("Empty: " + empty);
        // System.out.println(seats[0][2]);

        int[][] grid={
            {4,11,7},
            {15,2,9},
            {6,13,1}
        };

        int maxv=grid[0][0], maxr=0,maxc=0;

        for(int r=0;r < grid.length;r++){
            for(int c=0;c < grid[r].length;c++){
                if(grid[r][c]>maxv){
                    maxv=grid[r][c];
                    maxr=r;
                    maxc=c;
                }
            }
        }
        System.out.println("Largest: " + maxv + " at row" + maxr + ", coloum " + maxc);
    }
}

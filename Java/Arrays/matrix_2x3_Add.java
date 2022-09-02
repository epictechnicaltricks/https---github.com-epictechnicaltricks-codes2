class matrix_2x3_Add
{
    public static void main(String args[])
    {

        // Array of array is called 2d array 
        // we can represent 3d array in [][][]
        // the elemnt of any 2d arreay have specific array on its own
        //array
        int[][] mat1 = {{1,2,3},
                         {3,4,5}};
        
        int[][] mat2 = {{3,1,3},
                        {3,5,5}};
                         
        
       int[][]  result={{0,0,0},
                        {0,0,0}};

         for(int x = 0; x<mat1.length; x++)
         {
            for(int y=0; y<mat2[x].length; y++)
            {
                 result[x][y] = mat1[x][y] + mat2[x][y];
                System.out.print(result[x][y]+" ");
            }
              System.out.println("");
         } // outer for loop end 


     }
}
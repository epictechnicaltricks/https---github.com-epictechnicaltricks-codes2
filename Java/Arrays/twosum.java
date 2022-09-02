class twosum{

// Tast case 
// [2,7,11,15]
// target : 9
// output : [0,1]


    
    public static int[] twoSum4(int[] nums, int target) {
        
        
        int x, pos1, pos2;
        for (int i=0; i<nums.length-1; i++)
        {
            
        for (int  j=i+1; j<nums.length; j++)
        {
            
        if(nums[i] + nums[j]==target){
         System.out.println("\n\n"+i+" "+j+"\n\n");  

            return new int[] {i,j};
        }
            
     
           
            
        }
        
        }
        
        
        return null;
       
        
        
    }

    public static void main(String args[])
    {
       int[] arr = {2,7,11,15};

  
         twoSum4(arr,26);
        
    }
}
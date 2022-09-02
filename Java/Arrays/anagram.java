import java.util.*;

class anagram{

// anagram means the string must be same if order is different 

// output :  
//  bisu = usbi = char same on word 

  static boolean check(String s1, String s2){
        
        char[] ch1= s1.trim().toCharArray();
        char[] ch2 = s2.trim().toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    if(Arrays.equals(ch1,ch2)) 
    return true;
    else 

    return false;

    }
    
    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 2 String :");
       String s1 = sc.nextLine();
       String s2 = sc.nextLine();

         if(check(s1,s2)){
            System.out.print("this is anagram");

         }else {

            System.out.print("Not anagram");
         }
    

       
           }
}
import java.util.*;

class sortString
{
    //sorting the string alphabatically

    public static void main(String args[])
    {

     String input = "58534";
     char[] ch=input.trim().toCharArray();
     Arrays.sort(ch);
     Collection.reverse(ch);
     System.out.println(ch);
   
    }
}
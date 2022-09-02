import java.util.*;

class inputArray
{

    public static void main(String args[]){
 
 
 Scanner sc= new Scanner(System.in);
    System.out.print("Enter 3 string : ");

int size = 3;
String[] input = new String[size];
    for(int x=0; x<size; x++)
    {
        System.out.println("for pos : "+x+" ");
       input[x]= sc.nextLine();

    }

    for(int y=0; y<size; y++)
    {
        System.out.println("\nValues at "+y+" "+input[y]);
    }

System.out.println("\nArray size : "+input.length);



    }
   

    
}
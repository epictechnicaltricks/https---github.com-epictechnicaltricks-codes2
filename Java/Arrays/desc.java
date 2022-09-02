import java.util.Scanner;
class desc
{


static void asce(int[] value){

int temp; 
int size = value.length;
for(int x=0; x<size-1; x++)
{
   for(int y=x+1; y<size; y++){ 

    // here added + 1 beacuse we have to compare the other
    //  elementes than the current element
    // now dt 28 aug 2022 , 10:38pm 
    // by jeet 



if(value[x]<=value[y]){
     temp=value[x];
    value[x]=value[y];  // swap function 
    value[y]=temp;
}
   
   }

   
}

//show thee data 
System.out.println("\nAsce order:");
for(int x=0; x<size; x++){
System.out.println(value[x]);
}

    

}

    public static void main(String args[])
    {
        int size = 4;
        int[] input = new int[size];
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter numbers for asce: ");

        for(int x=0; x<size;  x++)
        {
            System.out.print("Enter for "+x+" :");
            input[x]= sc.nextInt();
         }

        asce(input); // asce order method
    }
}
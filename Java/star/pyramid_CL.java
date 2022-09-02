class pyramid_CL{

    public static void main (String args[]){
int size = 5;
for(int h=size; h>=-size; h--){

for (int w=size; w>=Math.abs(h); w--){
   
System.out.print(w+"  ");
    }
 
 System.out.println("");
 }

 /////////////////////

 int size2= 5;

for(int h=size2; h>=-size2; h--){

for (int w=1; w>=Math.abs(h); w++){
   
System.out.print(" ");
    }

 
for (int k=size2; k>=Math.abs(h); k--){
   
System.out.print(k);
    }

 System.out.println("");

 }








}


    
    }

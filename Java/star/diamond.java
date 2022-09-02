class diamond{

    public static void main(String args[]){
System.out.println("\n Diamond  : NORMAL + DOWN TRINGLE (int  4 on begnning)");


//////////////////////////
// NORMAL TRINGLE 

for(int h=0; h<4; h++){  

   for(int w=h; w<4; w++){
      System.out.print("  ");} 
    
    for(int w=0; w<=h; w++){
       System.out.print(w+"   ");}

   System.out.println();}


//////////////////////////////////////
// Tringle DOWN 

       for(int h=0; h<=4; h++) {

          for(int w=0; w<h; w++){
             System.out.print("  ");}

            for(int w=h; w<5; w++){
             System.out.print(w+"   ");}
               
           System.out.println(); }



}
}
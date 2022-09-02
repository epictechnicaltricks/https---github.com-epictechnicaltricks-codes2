class tringle{

public static void main(String args[]){
System.out.println("\n Tringle  :  3 for loop \n(w=h; w<5; w++) : TL\n(w=0; w<=h; w++) : BL");
  // combination of pyramid 1 and 2c

//  for(int h=0; h<5; h++){  

//    for(int w=h; w<5; w++)
//     {
//       System.out.print("  ");
//     } 
    
//     for(int w=0; w<=h; w++)
//     {
//        System.out.print("^   ");
//     }

//    System.out.println();
// }


//////////


for(int h=1; h<8; h++){  

   for(int w=h; w>=1; w--)
    {
      if(h>=w){
         System.out.print("* ");
      }else {
         System.out.print(" ");
      }
     
    } 
   

   System.out.println();

   
}

}
}
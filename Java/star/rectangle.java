class rectangle{


public static void main(String args[]){
System.out.println("\n Rectangle  :  2 for loop \n(int w=0; w<5; w++) : All \nif (h==0|| w==0 || h==4 || w==4) else ' ' : sides\n");

for(int h=0; h<5; h++){

    for(int w=0; w<5; w++){
       
        if(h==0|| w==0 || h==4 || w==4){

            //Rectangle

System.out.print(w+"  ");
        } else {
 System.out.print("   ");
    }
   

    }
 System.out.println("");
}
       
    }
}
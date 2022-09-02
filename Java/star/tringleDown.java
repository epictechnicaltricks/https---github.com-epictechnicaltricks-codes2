class tringleDown{

    public static void main(String args[]){
System.out.println("\n Bottom Tringle  :  3 for loop \n(w=0; w<h; w++) : BL\n(w=h; w<=5; w++) : TL");

       for(int h=0; h<=5; h++) {
          
           for(int w=0; w<h; w++){
             System.out.print("  ");}

           for(int w=h; w<5; w++){
             System.out.print("*   ");}

            System.out.println(); 
}
    }}
class rectangleStar{

public static void main(String args[]){
    
 

    for(int x= 0; x<5; x++){

        for(int y=0; y<5; y++){

           if(x==0 || y==0 || x==4 || y==4)
            System.out.print("\t *");
            
            else {
                System.out.print("\t");
            }

            //System.out.print(+y);

        }

        System.out.println();
    }
    

    }

}
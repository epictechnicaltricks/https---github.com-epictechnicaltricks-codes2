import java.text.DecimalFormat;
 // required to import this lib

class Format
{
    public static void main(String args[])
    {

         float n = 5.2f; int x= 7;
 
         System.out.printf(" n = %.4f\n", n); 
        //  n = 5.2000
         
        System.out.format(" n = %10.4f\n", n);  
        // n =     5.2000 , blank space 

        System.out.printf(" n = %d\n", x);  
        // x = 5

        //////DECIMAl format 
     DecimalFormat ft = new DecimalFormat();

          double num = 123.4567;
         ft = new DecimalFormat("##");
         System.out.println(" output "+ft.format(num));
        // 1234

      double income = 1234567890;
        ft = new DecimalFormat("$##,###.##");
        System.out.println(" "  + ft.format(income));

    

    }
}
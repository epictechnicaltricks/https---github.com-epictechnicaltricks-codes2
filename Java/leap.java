import java.util.Scanner;

public class leap{

	 public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enyer the year ");
int x = sc.nextInt();

if(x%400==0 && x%100==0 || x%4==0 && x%100!=0)

System.out.println("This is leap year");

else System.out.print("This is not leap year ");




		

	}
}
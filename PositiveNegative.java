import java.util.*;

public class PositiveNegative {
	 public static void main(String args[]) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter num");
	   int num = sc.nextInt();

	   if(num > 0) {
	      System.out.println("Positve");

	   } else if(num == 0) {
	      System.out.println("zero");

	   } else {
	      System.out.println("negative");
	   }
	 }
}
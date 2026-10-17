import java.util.*;

public class SumOfNatural {
	 public static void main(String args[]) {

	   Scanner sc = new Scanner(System.in);

	   System.out.println("enter N natural num");
	   int n = sc.nextInt();

	   int sum = 0;
	   int i = 1;

	   while(i <= n) {
	      sum += i;
	      i++;
	   }
	     System.out.println("total sum of natural num:- "+ sum);
	 }
}
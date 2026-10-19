import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  System.out.println("enter number");
	  int num = sc.nextInt();

      int even = 0, odd = 0;

	  for(int i=1; i<=num; i++) {
	     if(i % 2 == 0) {
	        even += i;
	     
	     } else {

	        odd += i; 
	     } 
	  }
	   System.out.println("sum of the even num :- " + even);
	     System.out.println("sum of the odd num :- " + odd);
	}
}
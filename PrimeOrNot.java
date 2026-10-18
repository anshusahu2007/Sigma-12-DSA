import java.util.*;

public class PrimeOrNot {
	 public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("enter number");
	  int num = sc.nextInt();

	  if(num == 2) {
	  	  System.out.println("num is prime");

	  } else {

	  	   boolean isPrime = true;

	  for(int i=2; i<Math.sqrt(num); i++) {
	    if(num % i == 0) {
           isPrime = false;
	    }
	  }  

	  if(isPrime == true) {
	     System.out.println("num is prime");
	  } else {
	     System.out.println("num is not prime");
	  }

	  }
     
      
	}
}
import java.util.*;

public class PrimeNum {
	public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
      
       System.out.print("enter number for check:-");
        int num = sc.nextInt();

        int div = 2;
        
        while(div < num) {

            if(num % div == 0) {
               System.out.print("number is not prime");
                  return;

            } else {
                div = div+1;
            }
        } 
            System.out.print("number is prime");
	}
}
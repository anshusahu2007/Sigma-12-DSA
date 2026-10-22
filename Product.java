import java.util.*;

public class Product {

   public static int multiple(int a, int b) {
          int product = a * b;
           return product;
   }
	
	public static void main(String[] args) {
	    int a = 4;
	    int b = 5;

	    int prod = multiple(a,b);
	     System.out.println("multiple is = "+prod);  

	     prod = multiple(9,10);
	      System.out.println("multiple is = "+prod);       
	}
}

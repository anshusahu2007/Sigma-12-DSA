import java.util.*;

public class HalfPyramidStar {
	 public static void main(String[] args) {

	    int n=4;

	    for(int row=1; row<=n; row++) {
	      for(int column=1; column<=n; column++) {

	         if(row+column > n) {
	             System.out.print("*");

	         } else {
	            System.out.print(" ");
	         }
	      }
	       System.out.println();
	    }
	 }
}
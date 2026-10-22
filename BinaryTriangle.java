import java.util.*;

public class BinaryTriangle  {
	public static void main(String[] args) {

	  int n=5;

	  for(int row=1; row<=n; row++) {
	    for(int column=1; column<=row; column++) {
	       if((row+column) % 2 == 0 ) {
                System.out.print("1");
	       }  else {
	           System.out.print("0");
	       }
	    }
	       System.out.println();
	  }
	}
}
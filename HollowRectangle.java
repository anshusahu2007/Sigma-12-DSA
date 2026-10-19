import java.util.*;

public class HollowRectangle {
	public static void main(String[] args) {

	  int r = 5, c = 4;

	  for(int column=0; column<c; column++) {
	     for(int row=0; row<r; row++) {
             
            if((column == 1 || column == 2) && (row == 1 || row == 2 || row == 3)) {
                 System.out.print("   ");

            }  else {
                System.out.print(" * ");
            }
	     }
	       System.out.println();
	  }
	}
}
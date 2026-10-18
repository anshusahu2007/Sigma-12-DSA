import java.util.*;

public class Continue2 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

	 System.out.println("enter number");
	 int num = sc.nextInt();

	 for(int i=1; i<=num; i++) {
	    if(i%10 == 0) {
	        continue;
	    } 
	      System.out.println(i);
	 }
	}
}
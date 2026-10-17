import java.util.*;

public class WeekSwitchCase {
	 public static void main(String args[]) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter a number for week");
	 int num = sc.nextInt();

	 switch(num) {
	  case 1:
	      System.out.println("monday");

	  case 2:
	      System.out.println("Tuesday");

	  case 3:
	      System.out.println("wednesday");

	  case 4:
	      System.out.println("Thursday");    
	    
      case 5:
	      System.out.println("Friday");

	  case 6:
	      System.out.println("Saturday");

	  case 7:
	      System.out.println("Sunday");    
	    }
    }
}
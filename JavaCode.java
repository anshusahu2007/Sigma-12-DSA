import java.util.*;

public class JavaCode {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	 System.out.println("enter cost of pencil");
	 float pencil = sc.nextFloat();

	 System.out.println("enter cost of pen");
	 float pen = sc.nextFloat();

	 System.out.println("enter cost of eraser");
	 float eraser = sc.nextFloat();

	 float total = pencil + pen + eraser;

	 System.out.println("total item bill is "+ total);


	 //Add on - with 18% tax 

	 float newTotal = total + (0.18f * total);

       System.out.print("bill with 18% tax: " + newTotal);
	}
}
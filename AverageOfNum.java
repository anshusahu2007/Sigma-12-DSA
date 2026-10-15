import java.util.*;

public class AverageOfNum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter 3 number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	int total = a + b + c;
	double average = total/3.0;

	System.out.print("average of total num :- "+ average);
	}
}
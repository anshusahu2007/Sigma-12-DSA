import java.util.*;

public class MaxNumOf3 {
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println("entre 3 number");
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int c = sc.nextInt();

	 if(a>b) {

	     if(a>c) {
	        System.out.print("greater number is :- "+a);
	    } else {
	        System.out.print("greater number is :- "+c);
            } 

     }else {

	        if(b>c) {
                System.out.print("greater number is :- "+b);
	          } else {
	             System.out.print("greater number is :- "+c);
	           }
	        }
	    }
	}
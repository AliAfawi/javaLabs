package lab1;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[]args) {
	int num;
	System.out.print("Enter a num: ");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	in.close();
	int a=1,b=1;
	System.out.print(a+", ");
	System.out.print(b);
	for (int i =1 ; i < num/2 ; i++) {
		a=a+b;
		b=b+a;
		System.out.print(", " +a);
		System.out.print(", "+b);
			
	}
	}
}

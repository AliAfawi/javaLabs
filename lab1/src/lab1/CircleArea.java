package lab1;
import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {
		double radius,area;
		System.out.println("Enter a radius: ");
		Scanner in=new Scanner(System.in);
		radius=in.nextDouble();
		in.close();
		area=radius*radius*Math.PI;
		System.out.print(area);
	}
}




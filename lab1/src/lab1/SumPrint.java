package lab1;
import java.util.Scanner;
public class SumPrint {
	public static void main(String[] args) {
		int num,sum=0;
		System.out.println("Enter a num: ");
		Scanner in = new Scanner(System.in);
		num= in.nextInt();
		in.close();
		for (int i=0 ; i<10 ; i++) {
			int temp=num ,count=0;
			for (int j=0 ; j<10 ; j++) {
				if (i == temp%10)
					count++;
				temp/=10;
			}
			if (count%2==0 && count!=0)
				System.out.print(i+", ");
			if (count%2==1 )
				sum+=i;

		}
		System.out.print("sum numbers is : "+sum);
	}
}

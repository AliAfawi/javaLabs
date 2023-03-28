package lab1;
import java.util.Scanner;
public class PrimaryNum {
	public static void main(String[] args) {
		int num;
		System.out.print("Enter a num: ");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		in.close();
		for(int i=2;i<num;i++) {
			int j=i,count=0;
			while(j!=0) {
				if (i%j==0)
					count++;
				j--;
			}
			if (count<3)
				System.out.print(i+" ");
		}
		
	}
}

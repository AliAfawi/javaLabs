package lab2;

import java.util.Iterator;

public class Stack1 {
	private int [] data;
	private int top1;

	public Stack1(Stack1 others) {
		top1=others.top1;
		data=new int[others.data.length];
		for (int i = 0; i < data.length; i++)
			data[i]=others.data[i];
	}
	public Stack1() {
		top1=-1;
		data=new int[10];
	}
	public void push(int value) {
		if (top1<data.length) 
			data[++top1]=value;
		else {
			int []temp = new int[data.length+5];
			for (int i = 0; i < data.length; i++)
				temp[i]=data[i];
			data=temp;
		}
	}
	
	public int pop() {
		if (top1!=-1)
			return data[top1--];
		return -1;
	}
	
	public int show() {
		return data[top1];
	}
	
	public boolean emptyStack() {
			return top1==-1;		
	}
	
//	public static void main(String[]args) {
//		Stack1 soso = new Stack1();
//		soso.push(2);
//		System.err.println(soso.pop());
//	}

	public void printStack() {
		System.out.println("mother my love");
		while(!this.emptyStack()) {
			System.out.println(this.pop());
		}
	}
	
}

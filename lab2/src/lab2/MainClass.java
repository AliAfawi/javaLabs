package lab2;

public class MainClass {
	public static Stack1 getReverseStack(Stack1 s) {
		Stack1 s1 = new Stack1();
		while(!s.emptyStack())
			s1.push(s.pop());
		return s1;
	}
	
	public static Stack1 getMaxStack(Stack1 s) {
		int max = s.show();
		Stack1 temp = new Stack1(s);
		Stack1 s1 = new Stack1();
		while(!temp.emptyStack()) {
			if(temp.pop()>max)
				return s1;
		}
		return s;
	}
	public static Stack1 getEvenStack(Stack1 s) {
		Stack1 temp = new Stack1(s);
		Stack1 s1 = new Stack1();
		while(!temp.emptyStack()) {
			int x = temp.pop();
			if(x%2==0) {
				s1.push(x);
			}
		}
		return s1;
	}
	
	public static void main(String[]args) {
		Stack1 s = new Stack1();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(3);
		
		Stack1 a = getEvenStack(s);
		a.printStack();
		
//		s1.printStack();
		

	}
}

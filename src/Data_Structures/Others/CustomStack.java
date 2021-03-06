package Java.Data_Structures.Others;

public class CustomStack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public CustomStack(int s){
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j){
		if(!isFull())
			stackArray[++top] = j;
		else
			System.out.println("Cannot Push More! Size Exceeded");
	}
	public char pop(){
		return stackArray[top--];
	}
	public char peek(){
		return stackArray[top];
	}
	public boolean isFull(){
		return (top == maxSize-1);
	}
	public boolean isEmpty(){
		return(top == -1);
	}
}

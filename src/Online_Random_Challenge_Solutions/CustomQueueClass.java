package Java_Helper_Codes;

public class CustomQueueClass {
	private long[] queue;
	private int front;
	private int rear;
	private int nItems;
	private int maxSize;
	
	public CustomQueueClass(int s){
		maxSize = s;
		queue = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long j){
		if(rear == maxSize - 1){
			rear = -1;
		}
		queue[++rear] = j;
		nItems++;
	}
	public long remove(){
		long temp = queue[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}
	
	public long peekFront(){
		if(nItems > 0)
			return queue[front];
		else
			return 0;
	}
	
	public long peekRear(){
		if(nItems > 0)
			return queue[rear];
		else
			return 0;
	}
	
	public boolean isEmpty()
	// true if queue is empty
	{ return (nItems==0);}
	
	public boolean isFull()
	// true if queue is empty
	{ return (nItems == maxSize);}
	
	public int size(){
		return nItems;
	}
}
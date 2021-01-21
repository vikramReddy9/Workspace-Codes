import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// useful when working with SAtock Exchange Market and bulk messaging system
		
//Queue is a datastructre it follows FIFO{First In First Out} 
// queue is pre processing order and it extends Collection.
// some methods like--->1)add(return type boolean) 2)offer(return boolean){--> used to insert specified element into the queue}
//3)remove(return type Object)-->used to retrive and remove head of the queue.
//4)poll--->removes the head of the queue.
//5)elelmnt(returntype object)--->used to retrive. 
//6)peek(returntype object)--->used to retrive.
// we have a class called as priority queue--> It provides the facility to use the queue but does not follow FIFO.
// It inherits abstructive class. by default it is ascending order 
	PriorityQueue<String>pq = new PriorityQueue();
	pq.add("vik");
	pq.add("sic");
	pq.add("aic");
	pq.add("bic");
	System.out.println(pq);
	System.out.println(pq.peek());// shows only the top elelment
	System.out.println(pq.element());//shows only the top 
	pq.poll();// removes the top of the element 
	System.out.println(pq);// for iterating we can use Iterator
	}

}

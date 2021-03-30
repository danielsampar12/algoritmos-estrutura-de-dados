package listas;

public class ArrayQueueTest {
	public static void main(String[] args) {
		ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>(5);
		arrayQueue.push(5);
		arrayQueue.push(4);
		arrayQueue.push(3);
		arrayQueue.push(2);
		arrayQueue.push(1);

		System.out.println(arrayQueue.toString());
		System.out.println(arrayQueue.peek());
		System.out.println(arrayQueue.pop());
		System.out.println(arrayQueue.pop());
		System.out.println(arrayQueue.pop());
		System.out.println(arrayQueue.pop());
		System.out.println(arrayQueue.pop());
		
		System.out.println(arrayQueue.toString());
		System.out.println(arrayQueue.isEmpty());
		
		try {
			System.out.println(arrayQueue.pop());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		arrayQueue.push(5);
		arrayQueue.push(4);
		arrayQueue.push(3);
		arrayQueue.push(2);
		arrayQueue.push(1);
		
		
		System.out.println(arrayQueue.isEmpty());
		System.out.println(arrayQueue.pop());
		System.out.println(arrayQueue.toString());
		arrayQueue.push(69);
		System.out.println(arrayQueue.toString());
	}
}

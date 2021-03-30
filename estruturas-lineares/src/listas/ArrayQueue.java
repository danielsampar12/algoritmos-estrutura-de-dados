package listas;

public class ArrayQueue<T> implements Queue<T> {
	private int start;
	private int limit;
	private int size;
	private T[] data;
	
	public ArrayQueue(int limit) {
		this.limit = limit;
		this.data = (T[]) new Object[limit];
		this.start = 0;
		size = 0;
	}

	@Override
	public void push(T valor) {
		if (size == limit) {
			throw new IndexOutOfBoundsException("Fila excedeu o limite.");
		}
		int position = (start + size) % limit;
		data[position] = valor;
		size++;
		
	}

	@Override
	public T peek() {
		if (this.isEmpty()) {
			throw new IndexOutOfBoundsException("Fila vazia.");
		}
		
		return data[start];
	}

	@Override
	public T pop() {
		T value = this.peek();
		data[start] = null;
		start = (start + 1) % limit;
		size--;
		
		return value;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}


	@Override
	public void clean() {
		this.data = (T[]) new Object[limit];
		this.start = 0;
		this.size = 0;
	}
	
	public String toString() {
		String str = "[";
		int pos;
		for (int i = 0; i < size; i++) {
			pos = (start + i) % limit;
			str += data[pos] + ", ";
		}
		str += "]";
		return str;
	}

}

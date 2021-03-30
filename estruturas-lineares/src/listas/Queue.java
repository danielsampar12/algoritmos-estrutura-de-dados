package listas;

public interface Queue<T> {
	void push(T valor);
	T peek();
	T pop();
	boolean isEmpty();
	void clean();
}

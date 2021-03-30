package listas;

public class PilhaVetor<T> implements Pilha<T> {
	private T[] info;
	private int limite;
	private int tamanhoAtual;

	public PilhaVetor(int limite) {
		this.limite = limite;
		info = (T[]) new Object[limite];
		tamanhoAtual = 0;
	}

	public PilhaVetor() {
		limite = 10;
		tamanhoAtual = 0;
		info = (T[]) new Object[limite];
	}

	@Override
	public void push(T valor) {
		if (tamanhoAtual >= limite) {
			throw new IndexOutOfBoundsException("Limite máximo da pilha alcançado");
		}
		info[tamanhoAtual] = valor;
		tamanhoAtual++;
	}

	@Override
	public T pop() {
		T temp = this.peek();
		tamanhoAtual--;
		info[tamanhoAtual] = null;

		return temp;
	}

	@Override
	public boolean estaVazia() {
		return (tamanhoAtual == 0);
	}

	@Override
	public T peek() {
		if (this.estaVazia()) {
			throw new IndexOutOfBoundsException("Pilha está vazia.");
		}
		return this.info[tamanhoAtual - 1];
	}

	@Override
	public void liberar() {
		this.info = (T[]) new Object[limite];
		tamanhoAtual = 0;
	}

	public String exibir() {
		String str = "[";
		for (int i = 0; i < tamanhoAtual; i++) {
			str += info[i] + ", ";
		}
		str += "]";
		return str;
	}
}

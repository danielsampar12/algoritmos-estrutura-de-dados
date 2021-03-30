package listas;

public class PilhaLista<T> implements Pilha<T> {

	private ListaEncadeada<T> info;
	private int limite;
	
	public PilhaLista() {
		info = new ListaEncadeada<T>();
	}
	
	@Override
	public void push(T valor) {
		info.inserir(valor);
	}

	@Override
	public T pop() {
		T valor = this.peek();
		info.retirar(valor);
		
		return valor;
	}

	@Override
	public T peek() {
		int tamanho = info.getTamanho();
		
	
		return null;
	}

	@Override
	public boolean estaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub
		
	}

}

package listas;

public class ListaEstatica {
	private int[] info;
	private int tamanho;
	
	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}
	
	private void redimensionar() {
		int[] novoVetor = new int[tamanho + 10];
		for (int i = 0; i < info.length; i++) {
			novoVetor[i] = info[i];
		}
		info = novoVetor;
	}
	
	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(int valor) {
		for (int i = 0; i < info.length; i++) {
			if (info[i] == valor) {
				return info[i];
			}
		}
		
		return -1;
	}
	
	public boolean estaVazia() {
		return info.length == 0;
	}
	
}

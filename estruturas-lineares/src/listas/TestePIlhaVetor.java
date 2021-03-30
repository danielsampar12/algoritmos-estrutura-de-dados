package listas;

public class TestePIlhaVetor {
	public static void main(String[] args) {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(5);
		pilha.push(5);
		pilha.push(4);
		pilha.push(3);
		System.out.println(pilha.exibir());
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.exibir());
		System.out.println(pilha.estaVazia());
		pilha.liberar();
		System.out.println(pilha.exibir());
		System.out.println(pilha.estaVazia());
	}
}

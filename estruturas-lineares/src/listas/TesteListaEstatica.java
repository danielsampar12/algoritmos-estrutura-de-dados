package listas;

import java.util.ArrayList;

public class TesteListaEstatica {

	public static void main(String[] args) {
		ListaEstatica lista = new ListaEstatica();
		lista.inserir(50);
		lista.inserir(-15);
		lista.inserir(12);
		lista.inserir(28);
		lista.inserir(91);

		int teste;
		teste = lista.buscar(25);
		System.out.println(teste);
		lista.estaVazia();
	}

}

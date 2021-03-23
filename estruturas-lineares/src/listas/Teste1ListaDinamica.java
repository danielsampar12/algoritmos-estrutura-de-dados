package listas;

public class Teste1ListaDinamica {

		public static void main(String[] args) {
			Lista lista = new ListaEncadeada();
			lista.inserir(50);
			lista.inserir(-15);
			lista.inserir(12);
			lista.inserir(28);
			lista.inserir(91);
			System.out.println("Lista original = "+lista.exibir());
			System.out.println("Buscar 50 = "+lista.buscar(50));
			System.out.println("Buscar 91 = "+lista.buscar(91));
			System.out.println("Buscar 100 = "+lista.buscar(100));
			lista.retirar(100);
			lista.retirar(50);
			System.out.println("Lista após retiradas = "+lista.exibir());
			System.out.println("Buscar 50 = "+lista.buscar(50));
			System.out.println("Buscar 91 = "+lista.buscar(91));
			lista.retirar(91);
			System.out.println("Buscar após retirada 91 = "+lista.buscar(91));
			lista.inserir(150);
			System.out.println("Lista após inserção = "+lista.exibir());
			
			Lista novaLista = new ListaEncadeada();
			lista.inserir(1);
			lista.inserir(1);
			lista.inserir(1);
			lista.inserir(1);
			lista.inserir(1);
			
			lista.concatenar(novaLista);
			
			System.out.println("Lista após contenar com array de 1 = "+lista.exibir());
			
			Lista split = new ListaEncadeada();
			
			split = lista.dividir();
			
			System.out.println("SPlit após divisão = "+split.exibir());
			
			System.out.println("Lista após divisão = "+lista.exibir());
	}

}
package listas;

public class ListaEncadeada implements Lista {
	private NoLista primeiro;
	private NoLista ultimo;
	private int qtdElementos;
	
	@Override
	public void inserir(int valor) {
		NoLista novo = new NoLista();
		novo.setInfo(valor);
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProximo(novo);
		}
		ultimo = novo;
		qtdElementos++;
		
	}
	@Override
	public int buscar(int valor) {
		int posicao = 0;
		NoLista p = primeiro;
		while (p != null) {
			if (p.getInfo() == valor) {
				return posicao;
			}
			p = p.getProximo();
			posicao++;
		}
		return -1;
	}
	@Override
	public void retirar(int valor) {
		NoLista anterior = null;
		NoLista p = primeiro;
		
		while (p != null && p.getInfo() != valor) {
			anterior = p;
			p = p.getProximo();
		}
		if (p != null) {
			qtdElementos--;
			if (anterior == null) {
				primeiro = p.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
			if (ultimo == p) {
				ultimo = anterior;
			}
		}
		
	}
	@Override
	public boolean estaVazia() {
		return (this.primeiro == null);
	}
	@Override
	public String exibir() {
		String str = "[";
		NoLista p = primeiro;
		while (p != null) {
			str += p.getInfo() + ", ";
			p = p.getProximo();
		}
		return str + "]";
	}
	@Override
	public Lista copiar() {
		ListaEncadeada novaLista = new ListaEncadeada();
		NoLista p = primeiro;
		
		while (p != null) {
			novaLista.inserir(p.getInfo());
			p = p.getProximo();
		}
		return novaLista;
	}
	@Override
	public void concatenar(Lista outra) {
		for (int i = 0; i < outra.getTamanho(); i++) {
			this.inserir(outra.pegar(i));
		}
		
	}
	@Override
	public int getTamanho() {
		return qtdElementos;
	}
	@Override
	public int pegar(int posicao) {
		if (posicao < 0 || posicao >= this.getTamanho()) {
			throw new IndexOutOfBoundsException("Posição inválida" + posicao);
		}
		
		int contador = 0;
		NoLista p = primeiro;
		while (p != null) {
			if (contador == posicao) {
				return p.getInfo();
			}
			p = p.getProximo();
			contador++;
			
		}
		
		return Integer.MIN_VALUE;
	}
	@Override
	public Lista dividir() {
		Lista novaLista = new ListaEncadeada();
		NoLista ultimoDepoisDaDivisao = new NoLista();
		
		for (int i = qtdElementos / 2; i < qtdElementos; i++) {
			novaLista.inserir(this.pegar(i));
		}
		
		ultimoDepoisDaDivisao.setInfo(this.pegar((qtdElementos / 2) - 1));
		
		ultimo = ultimoDepoisDaDivisao;
		
		ultimo.setProximo(null);
		
		return novaLista;
	}
	
		
}

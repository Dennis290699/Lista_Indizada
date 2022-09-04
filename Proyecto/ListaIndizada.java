package Proyecto;

public class ListaIndizada {
	private NodoIndice inicio, ultimo;
	private Integer tamanio;

	public ListaIndizada() {
		tamanio = 0;
		inicio = new NodoIndice();
		ultimo = new NodoIndice();
		inicio.setSiguiente(ultimo);
		ultimo.setSiguiente(null);
	}
	
//	METODOS DE OPERACIONES DE LA INDICE
	
	public void InsertarInicio(Nodo referencia, char indice) {
		NodoIndice nuevo = new NodoIndice(indice, referencia);
		NodoIndice Tmp = this.inicio.getSiguiente();
		this.inicio.setSiguiente(nuevo);
		nuevo.setSiguiente(Tmp);
		this.tamanio++;
	}

	public Nodo BuscarIndices(char indice) {
		NodoIndice Tmp = this.inicio;

		while (Tmp != ultimo) {
			if (indice == Tmp.getDato()) {
				
				return Tmp.getReferencia();
			}
			Tmp = Tmp.getSiguiente();
		}
		return null;
	}

	public void ImprimirIndices() {
		NodoIndice Tmp = this.inicio.getSiguiente();

		while (Tmp.getSiguiente() != null) {
			System.out.println(Tmp.getDato());
			Tmp = Tmp.getSiguiente();
		}
		if (inicio.getSiguiente() == ultimo)
			System.out.println("Vacia");
	}

}//FINAL CLASS

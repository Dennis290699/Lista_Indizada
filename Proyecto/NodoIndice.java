package Proyecto;

public class NodoIndice {

	private NodoIndice siguiente;
	char dato;
	private Nodo referencia;

	public NodoIndice() {
		this.setDato(' ');
		this.setSiguiente(null);
	}

	public NodoIndice(char p, Nodo referencia) {
		this.setDato(p);
		this.referencia = referencia;
		this.setSiguiente(null);
	}
	
	public Nodo getReferencia() {
		return referencia;
	}

	public void setReferencia(Nodo referencia) {
		this.referencia = referencia;
	}

	public char getDato() {
		return dato;
	}

	public void setDato(char dato) {
		this.dato = dato;
	}

	public NodoIndice getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoIndice siguiente) {
		this.siguiente = siguiente;
	}

}//FINAL CLASS

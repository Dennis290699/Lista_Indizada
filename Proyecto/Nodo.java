package Proyecto;

public class Nodo {
	private Persona obj;
	private Nodo siguiente;

	public Nodo() {
		obj = null;
		siguiente = null;
	}

	public Nodo(Persona p) {
		obj = p;
		siguiente = null;
	}

	public Nodo(String nombre) {
		obj = new Persona(nombre);
		siguiente = new Nodo();
	}

	public Persona getDato() {
		return obj;
	}

	public void setObj(Persona obj) {
		this.obj = obj;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}//FINAL CLASS

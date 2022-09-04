package Proyecto;

public class Lista {
	
	private Nodo inicio, ultimo;
	private Integer longuitud;
	ListaIndizada indice = new ListaIndizada();

	public Lista() {
		longuitud = 0;
		inicio = new Nodo();
		ultimo = new Nodo();
		inicio.setSiguiente(ultimo);
		ultimo.setSiguiente(null);
	}
	
//	METODOS DE OPERACIONES DE LA INDICE

	public void Insertar(String nombre) {
		Nodo nuevo = new Nodo(nombre);
		char letra = nombre.charAt(0);
		Nodo Tmp = this.inicio.getSiguiente();
		if (Tmp == ultimo) {
			// si no existen indices crea uno y a�ade el nodo
			indice.InsertarInicio(nuevo, letra);
			this.inicio.setSiguiente(nuevo);
			nuevo.setSiguiente(Tmp);
		} else {
			// si el indice no esta vacio
			Nodo Tmp2 = indice.BuscarIndices(letra);
			if (Tmp2 == null) {
				// si el indice no existe crea un nuevo indice y a�ade al inicio
				indice.InsertarInicio(nuevo, letra);
				this.inicio.setSiguiente(nuevo);
				nuevo.setSiguiente(Tmp);
			} else {
				// si el indice si existe a�ade despues de este
				nuevo.setSiguiente(Tmp2.getSiguiente());
				Tmp2.setSiguiente(nuevo);
			}
		}
		this.longuitud++;
	}
	
//	public Nodo Eliminar(String nombre) {
//		char letra = nombre.charAt(0);
//		Nodo indi = indice.Buscar(letra);
//		Nodo tmp1 = this.inicio.getSiguiente();
//
//		if (indi != null) {
//			// si el indice no esta vacio busca desde este indice para elinarlo, sigue
//			// buscando hasta que los datos que se analizan salen del indice
//			char e = indi.getDato().getNombre().charAt(0);
//			System.out.println(e);
//			while (e == indi.getDato().getNombre().charAt(0)) {
//				if (indi.getDato().getNombre().charAt(0) == e) {
//					
//					tmp1.setSiguiente(indi.getSiguiente());
//					
////					tmp1 = indi.getSiguiente();
////					indi = indi.getSiguiente();
//					
//					indi.setSiguiente(tmp1.getSiguiente());
//					this.fin = indi;
////					System.out.println(tmp1.getDato());
////					tmp1.setSiguiente(null);
//					this.longuitud--;
//					return indi;
//				
//				}
//				tmp1 = indi.getSiguiente();
//			}
//			System.out.println("No existe el nombre");
//		}
//		System.out.println("No existe el indice");
//		return null;
//	}

//	public Nodo Eliminar(String nombre) {
//		char letra = nombre.charAt(0);
//		Nodo indi = indice.Buscar(letra);
//		Nodo tmp2 = this.inicio;
//		if (indi != null) {
//			// si el indice no esta vacio busca desde este indice para elinarlo, sigue
//			// buscando hasta que los datos que se analizan salen del indice
//			char e = indi.getDato().getNombre().charAt(0);
//			while (e == indi.getDato().getNombre().charAt(0)) {
//				if (indi.getDato().getNombre().equals(nombre)) {
//					tmp2.setSiguiente(indi.getSiguiente());
//					indi.setSiguiente(null);
//					this.longuitud--;
//					return indi;
//				}
//				indi = indi.getSiguiente();
//				tmp2 = tmp2.getSiguiente();
//			}
//			System.out.println("PERSONA NO REGISTRADA :(");
//		}
//		System.out.println("CARACTER NO REGISTRADO :(");
//		return null;
//	}
	
	public Nodo EliminarIndice(String nombre) {
	char letra = nombre.charAt(0);
	Nodo indi = indice.BuscarIndices(letra);
	Nodo tmp2 = this.inicio;

	if (indi != null) {
		// si el indice no esta vacio busca desde este indice para elinarlo, sigue
		// buscando hasta que los datos que se analizan salen del indice
		char e = indi.getDato().getNombre().charAt(0);
		System.out.println(e);
		while (e == indi.getDato().getNombre().charAt(0)) {
			if (indi.getDato().getNombre().charAt(0) == e) {
					tmp2.setSiguiente(indi.getSiguiente());
					indi.setSiguiente(null);
					this.longuitud--;
					return indi;
				}
				indi = indi.getSiguiente();
				tmp2 = tmp2.getSiguiente();
			}
			System.out.println("PERSONA NO REGISTRADA :(");
		}
		System.out.println("CARACTER NO REGISTRADO :(");
		return null;
	}

//	public Nodo Buscar(String nombre) {
//		char letraNombre = nombre.charAt(0);
//		Nodo tmp = indice.Buscar(letraNombre);
//		if (tmp != null) {
//			char letra = tmp.getDato().getNombre().charAt(0);
//			// si el indice no esta vacio, busca dentro de este indice hasta encontrar una
//			// coincidencia
//			while (letra == tmp.getDato().getNombre().charAt(0)) {
//				if (tmp.getDato().getNombre().equals(nombre)) {
//					System.out.println(tmp.getDato().toString());
//					return tmp;
//				}
//				tmp = tmp.getSiguiente();
//			}
//			System.out.println("PERSONA NO REGISTRADA :(");
//		} else {
//			// si el indice esta vacio la lista esta vacia
//			System.out.println("CARACTER NO REGISTRADO :(");
//		}
//		return null;
//	}

	public void Imprimir() {
		Nodo imprimir = this.inicio.getSiguiente();

		if (indice != null) {
			while (imprimir.getSiguiente() != null) {
				System.out.println(imprimir.getDato());
				imprimir = imprimir.getSiguiente();
			}
		} else {
			System.out.println("LISTA VACIA :)");
		}
	}
	
	public void imprimirIndices() {
		Nodo imprimir = this.inicio.getSiguiente();

		if (indice != null) {
			while (imprimir.getSiguiente() != null) {
				imprimir = imprimir.getSiguiente();
			}
			indice.ImprimirIndices();
		} else {
			System.out.println("NO EXISTEN CARACTERES :(");
		}
	}
	
	public Nodo BuscarIndice(String nombre) {
		char letraNombre = nombre.charAt(0);
		Nodo tmp = indice.BuscarIndices(letraNombre);
		System.out.println(letraNombre);
		if (tmp != null) {
			char letra = tmp.getDato().getNombre().charAt(0);
			while (letra == tmp.getDato().getNombre().charAt(0)) {
				if (tmp.getDato().getNombre().charAt(0) == letraNombre) {
					System.out.println("Resultado: "+tmp.getDato());
					return tmp;
				}
				tmp = tmp.getSiguiente();
			}
			System.out.println("PERSONA NO REGISTRADA :(");
		} else {
			System.out.println("CARACTER NO REGISTRADO :(");
		}
		return null;
	}

}//FINAL CLASS

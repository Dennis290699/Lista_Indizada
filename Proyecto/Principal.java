package Proyecto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);

		Lista lista = new Lista();
		int opccion = 0;

		do {

			System.out.println("[1] Ingresar" 
						   + "\n[2] Mostrar" 
						   + "\n[3] Indices de los nombres" 
						   + "\n[4] Buscar por indices"
						   + "\n[5] Eliminar por indices" 
						   + "\n[6] Salir");

			opccion = tec.nextInt();

			switch (opccion) {
			case 1:
				System.out.println("Ingrese el nombre: ");
				String nombre = tec.next();
				lista.Insertar(nombre);
				System.out.println();
				break;

			case 2:
				lista.Imprimir();
				System.out.println();
				break;

			case 3:
				lista.imprimirIndices();
				System.out.println();
				break;

			case 4:
				System.out.println("Ingrese el primer caracter a buscar: ");
				String nombre1 = tec.next();
				lista.BuscarIndice(nombre1);
				System.out.println();
				break;

			case 5:
				Nodo Eliminar_Per = new Nodo();
				System.out.println("Ingrese el primer caracter para eliminar: ");
				String nombre2 = tec.next();
				Eliminar_Per = lista.EliminarIndice(nombre2);

				if (Eliminar_Per != null)
				System.out.println("Se elimino a: " + Eliminar_Per.getDato());
				System.out.println();
				
				break;
			}

		} while (opccion != 6);
		System.out.println("Tenga un buen dia :)");

	}

}//FINAL CLASS
























//Lista Mylist = new Lista();
//ListaIndizada lista1 = new ListaIndizada();
//System.out.println("\n --- ELEMENTOS INSERTADOS ---");
//Mylist.Insertar("CHAMBA");
//Mylist.Insertar("DENNIS");
//Mylist.Insertar("JOEL");
//Mylist.Insertar("ANA");
//Mylist.Insertar("JAIR");
//Mylist.Imprimir();
//
//Nodo Eliminar_Per =new Nodo();
//Eliminar_Per = Mylist.EliminarIndice("A");
//if(Eliminar_Per != null) 
//System.out.println("\n --- ELIMINAR ---");
//System.out.println("Se elimino a: "+Eliminar_Per.getDato());
//System.out.println("Nueva lista");
//Mylist.Imprimir();
//
////Nodo Buscar_Per = new Nodo();
////Buscar_Per = Mylist.BuscarIndice("J");
////if (Buscar_Per != null)
////	System.out.println("Se encontro: " + Buscar_Per.getDato());
//
////

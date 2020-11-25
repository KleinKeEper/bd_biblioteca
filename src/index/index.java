package index;

import java.util.ArrayList;
import java.util.List;

import modeloDaoImp.LibroDaoImp;
import utils.leer;

public class index {
	
	
	private static void listarLibro() {
		// TODO Auto-generated method stub
		LibroDaoImp libroDaoImp = new LibroDaoImp();		
		ArrayList<List> lista = new ArrayList<>();
		lista = libroDaoImp.listarReporte();
		System.out.println("  --- LISTAR LIBRO ----");
		leer.saltoLinea(1);
		
		System.out.println("ID\tLibro\t\t\tAutor\tEditorial\tCodigo\tStock");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).get(0) + "\t" + lista.get(i).get(1) + "\t\t" + lista.get(i).get(2) + "\t" + lista.get(i).get(3) + "\t" + lista.get(i).get(4) + "\t" + lista.get(i).get(5));
		}
		
		
		
		
		
		
		
	}

	public static void menu() {
		System.out.println("1. Listar Libro");
		System.out.println("2. Agregar Libro");
		System.out.println("3. Editar Libro");
		System.out.println("4. Listar Editorial");
		System.out.println("5. Salir");
	}
	
	public static void main(String[] args) {
		int opcion;
		
		do {
			menu();
			System.out.print("Ingrese una opcion valida: ");
			opcion = leer.entero();
			switch (opcion) {
			case 1: listarLibro();
			break;
			default:
				break;
			}
		} while (opcion != 5);
		
	}
}

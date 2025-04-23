package prueba;

import java.util.ArrayList;
import java.util.List;

public class EjArrayList {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		
		frutas.add("Manzana");
		frutas.add("Plátano");
		frutas.add("Naranja");
		frutas.add("Manzana");
		
		System.out.println("Listado de frutas: ");
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		
		System.out.println("Primera fruta de la lista " + frutas.get(0));
		System.out.println("Ultima fruta de la lista " + frutas.size());
		
		if(frutas.contains("Patata")) {
			System.out.println("No hay patatas en la lista");
		}

	}

}

package Ejercicios_1_Listas;

import java.util.ArrayList;
import java.util.Scanner;


public class AgendaContactos {
	//Atributos
	private ArrayList<Contacto> contactos;
			
	//Constructor
	public AgendaContactos() {
		contactos = new ArrayList<>();
	}
		
	Scanner sc = new Scanner(System.in);
			
	public void AddContacto() {
		System.out.print("Introduce el nombre del contacto: ");
	    String nombre = sc.nextLine();

	    System.out.print("Introduce el teléfono del contacto: ");
	    String telefono = sc.nextLine();
	        
		Contacto nuevoContacto = new Contacto(nombre, telefono);
		contactos.add(nuevoContacto);
			
		System.out.println("Contacto guardado exitosamente.");
				
	}
		
	public void ShowContactos() {
		if(contactos.isEmpty()) {
			System.out.println("No hay contactos guardados.");
		} else {
			for (Contacto c : contactos) {
				System.out.println(" [ " + c + " ]");
			}
		}
	}
	
	public void SearchContatcos() {
		System.out.println("Introduce el nombre del contacto");
		String nombre = sc.nextLine();
		
		boolean encontrado = false;
	    for (Contacto c : contactos) {
	        if (c.getNombre().equalsIgnoreCase(nombre)) {
	            System.out.println("Contacto encontrado- " + c);
	            encontrado = true;
	            break;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("Contacto no encontrado.");
	    }
	}
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
			

		public static void main(String[] args) {
			
			AgendaContactos agendaContactos = new AgendaContactos();
			
			Scanner sc = new Scanner(System.in);
			
			boolean ejecutando = true;
			
			while(ejecutando) {
				
				System.out.println("\n***********************");
				System.out.println("* AGENDA DE CONTACTOS *");
				System.out.println("***********************");
				System.out.println("* 1. Nuevo contacto   *");
				System.out.println("*---------------------*");
				System.out.println("* 2. Mis contactos    *");
				System.out.println("*---------------------*");
				System.out.println("* 3. Buscar contacto  *");
				System.out.println("*---------------------*");
				System.out.println("* 4. Salir            *");
				System.out.println("***********************");
				int opcion = sc.nextInt();
				
				switch (opcion) {
				case 1: {
					agendaContactos.AddContacto();
					break;
				}
				
				case 2: {
					System.out.println(" Lista de contactos: ");
					System.out.println(" --------------------");
					agendaContactos.ShowContactos();
					break;
				}
				
				case 3: {
					agendaContactos.SearchContatcos();
					break;
				}
				
				case 4: {
					System.out.println("Saliendo...");
					ejecutando = false;
					break;
					
				}
				
					default:
					System.out.println("Introduce un numero válido");
		
				}
				
			}
			
			

		}
}

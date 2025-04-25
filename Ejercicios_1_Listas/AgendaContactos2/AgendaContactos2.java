package AgendaContactos2;

import java.util.ArrayList;
import java.util.Scanner;

import Ejercicios_1_Listas.AgendaContactos;

public class AgendaContactos2 {
	
	private ArrayList<String[]> contactos;
	
	public AgendaContactos2() {
		
		contactos = new ArrayList<String[]>();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void AddContacto() {
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el teléfono del contacto: ");
        String telefono = sc.nextLine();

        String[] nuevoContacto = new String[2];
        nuevoContacto[0] = nombre;
        nuevoContacto[1] = telefono;

        contactos.add(nuevoContacto);

        System.out.println("Contacto guardado exitosamente.");
    }

    public void ShowContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos guardados.");
        } else {
            for (String[] c : contactos) {
                System.out.println(" · Nombre: " + c[0] + " | Teléfono: " + c[1]);
            }
        }
    }

    public void SearchContactos() {
        System.out.println("Introduce el nombre del contacto:");
        String nombre = sc.nextLine();

        boolean encontrado = false;
        for (String[] c : contactos) {
            if (c[0].equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado - Nombre: " + c[0] + " | Teléfono: " + c[1]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }




	public static void main(String[] args) {
		
		AgendaContactos2 agendaContactos2 = new AgendaContactos2();
		
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
				agendaContactos2.AddContacto();
				break;
			}
			
			case 2: {
				System.out.println("");
				System.out.println("  Lista de contactos: ");
				System.out.println(" ---------------------");
				agendaContactos2.ShowContactos();
				break;
			}
			
			case 3: {
				agendaContactos2.SearchContactos();
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

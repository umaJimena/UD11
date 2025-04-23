package Ejercicios_1_Listas;

public class Contacto {
	String nombre;
    String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + ": " + telefono;
    }
	
}

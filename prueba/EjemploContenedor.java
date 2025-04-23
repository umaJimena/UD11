package prueba;

public class EjemploContenedor<T> {
	// declaracion del atributo
	private T objeto; //atributo de tipo generico
	
	public EjemploContenedor() {
		// vacio porque la inicializacion del atributo es null

	}
	public void guardar (T nuevo) {
		objeto = nuevo; //asignacion de un valor al atributo, que sera de tipo generico
	}
	
	public T extraer() {
		T res = objeto;
		objeto = null;
		return res;
	}
	
	public static void main(String[] args) {
		// Crear objeto de la clase EjemploContenedor, para el; tipo concreto integrer
		EjemploContenedor<Integer> c = new EjemploContenedor<Integer>();
		// equivalente a la línea anterior
		// EjemploContenedor<Integer> c = new EjemploContenedor<Integer>();
		c.guardar(5); //El compilador comprueba que el tipo del valor pasado es Integer, si no, falla 
		Integer n = c.extraer();
		System.out.println(n);
	}
}




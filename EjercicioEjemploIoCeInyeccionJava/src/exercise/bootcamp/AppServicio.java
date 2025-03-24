package exercise.bootcamp;

public class AppServicio implements AppInterfaz {

	
	//En esta clase servicio, se implementa el interfaz con los diferentes métodos presentes en la interfaz
	
	//Se pueden añadir manualmente o en el error de AppServicio nada más añadir implements interfaz y completar con el texto/código que queramos
	@Override
	public void mostrar() {
		System.out.println( "Mostramos el ejercicio de muestra para el ejercicio 2.4 del Bootcamp Ejemplo de IoC e Inyección en Java ");
	}

	//Ejemplo de nuevo mensaje
	@Override
	public void lanzarMensaje() {
		System.out.println("Probamos a lanzar varios mensajes con el objetivo de trabajar la inyección de dependencias en java");
		
	}

	@Override
	public void insertarPalabra(String palabra) {
		System.out.println( "Este ejemplo nos servirá para insertar una variable, en mi caso una palabra: " +palabra);
		
	}

	@Override
	public void eliminarDatos(int id) {
		System.out.println("Eliminando datos con el id: " +id);
	}
}

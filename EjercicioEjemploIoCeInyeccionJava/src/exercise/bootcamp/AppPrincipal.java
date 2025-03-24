package exercise.bootcamp;

public class AppPrincipal {
	
	AppInterfaz realizarAccion;
	
	public AppPrincipal(AppInterfaz realizarAccion) {
		this.realizarAccion = realizarAccion;
	}
	
	public void ejecutar() {
		System.out.println("Ejemplo que se cumple cuando ejecutamos nuestro programa para inyectar dependencias");
		realizarAccion.mostrar();
		realizarAccion.lanzarMensaje();
		realizarAccion.insertarPalabra("Ejemplo");
		realizarAccion.eliminarDatos(3);
	}
	
	

	public static void main(String[] args) {
		
		AppServicio ejemploEjercicio = new AppServicio();
		AppPrincipal ejemplo = new AppPrincipal(ejemploEjercicio);
		ejemplo.ejecutar();

	}

}

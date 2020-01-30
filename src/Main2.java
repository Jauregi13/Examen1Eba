import java.util.Scanner;

public class Main2 {
	/*
	 * Esta funcion compara la cadena de texto introducida con los valores del array
	 * Si la cadena de texto aparece en algun valor del array mostrara por pantalla
	 * ese valor del array
	 */
	public static void buscador (String[] nombres, String cadena){
		//recorrer el array
		for (int i = 0; i < nombres.length; i++){
			//convertir el nombre y apellido del array a minuscula
			String nombre_minuscula = nombres[i].toLowerCase();
			//convertir la cadena de texto introducida a minuscula
			String cadena_minuscula = cadena.toLowerCase();
			//comparar el nombre y apellido con la cadena
			if(nombre_minuscula.contains(cadena_minuscula)){
				System.out.println(nombres[i]);
			}
			// mandar mensaje si no existe
			else{
				System.out.println("No existe ningun nombre con esa cadena de texto");
			}
		}
		
		
	}
	/*
	 * Esta funcion comprueba el nombre y apellido que hemos introducido si existe en el 
	 * array
	 */
	public static boolean existe(String[] nombres, String nombre){
		boolean existe = true;
		//recorrer el array
		for (int i = 0; i < nombres.length; i++){
			//convertir el nombre y apellido del array a minuscula
			String nombre_minuscula = nombres[i].toLowerCase();
			//convertir el nombre y apellido introducido a minuscula
			String cadena_minuscula = nombre.toLowerCase();
			//comparar si son iguales el valor del array el valor introducido por teclado
			if (nombre_minuscula.equals(cadena_minuscula)){
				existe = true;
				break;
			}
			else{
				existe = false;
			}
		}
		return existe;
		
		
	}

	public static void main(String[] args) {
		final int BUSCADOR = 1;
		final int INTRODUCIR_NOTAS = 2;
		final int SALIR = 3;
		String[] nombres = {"Jon Aranguren", "Zorion Kareaga", "Jon Alberdi", 
				"Andoni Bermudez", "Oier Kareaga", "Oier Urkiza", "Manuel Lasarte", 
				"Arkaitz Sodupe", "Xabi Urkizu", "Mikel Dieguez", "Alexander Urresti"
				};
		Scanner lector = new Scanner (System.in);
		int opcion;
		
		//iteracion del menu		
		do {
			System.out.println("Elige una opcion para el menu:");
			System.out.println("-------MENU-------");
			System.out.println(BUSCADOR+". Buscar un nombre introduciendo una cadena de texto");
			System.out.println(INTRODUCIR_NOTAS+". Introducir un nombre, pedir 3 notas y hacer la media");
			System.out.println(SALIR+". Salir");
			// la opcion introducida por teclado
			opcion = Integer.parseInt(lector.nextLine());
			
			switch (opcion){
				case BUSCADOR:
					
					System.out.println("Introduce una cadena de texto:");
					//guardar la cadena de texto introducida por teclado
					String cadena = lector.nextLine();
					//utilizar el procedimiento para comprobar si encuentra nombres
					buscador(nombres, cadena);
					
					break;
				case INTRODUCIR_NOTAS:
					System.out.println("Introduce el nombre y el apellido:");
					String nombre = lector.nextLine();
					double media = 0;
					int suma = 0;
					int divisor = 0;
					/*
					 *  En este if entrara si son iguales el nombre introducido con el
					 *  valor del array
					 */
					if (existe(nombres, nombre)){
						//introducir las notas
						for (int i = 0; i <3; i++){
							System.out.println("Introduce nota "+ (i+1) +":");
							int nota = Integer.parseInt(lector.nextLine());
							/*
							 * ir sumando los valores que se introducen por teclado
							 * y se guardaran en la variable suma
							 */
							suma = suma + nota;
							divisor++;
						}
						/*
						 * despues de sumar todas las notas calculamos la media
						 */
						media = suma / divisor;
						
						System.out.println("La media de las notas es: " + media);
					}
					else{
						System.out.println("No existe ningun nombre");
					}
					break;
				case SALIR:
					//salir del programa
					System.out.println("Saliendo...");
					break;
				
				default:
					System.out.println("Opcion introducida incorrecta");
					
			}
		}
		while (opcion != SALIR);
		
		System.out.println("Fin de programa");

	}

}

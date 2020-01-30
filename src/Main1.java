import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/Examen/notas.txt");
		Scanner lector = new Scanner(fichero);

		// añadir los numeros al array
		String linea = lector.nextLine();

		String[] numeros = linea.split(",");
		
		int numero;
		//recorrer el array
		for (int i = 0; i < numeros.length; i++){
			//convertir string a integer para despues comparar como si fuera un numero
			numero = Integer.parseInt(numeros[i]);
			//comparar el numero convertido con cada condicion
			if (numero >=1 && numero <=4){
				System.out.println("La nota de valor " + numero + " es: INSUFICIENTE");
			}
			else if (numero == 5){
				System.out.println("La nota de valor " + numero + " es: SUFICIENTE");
			}
			else if (numero == 6){
				System.out.println("La nota de valor " + numero + " es: BIEN");
			}
			else if (numero >= 7 && numero <= 8){
				System.out.println("La nota de valor " + numero + " es: MUY BIEN");
			}
			else {
				System.out.println("La nota de valor " + numero + " es: SOBRESALIENTE");
			}
		}


	}

}

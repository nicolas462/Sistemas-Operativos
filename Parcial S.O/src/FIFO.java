import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Algoritmo FIFO utilizado como algoritmo de reemplazo de páginas en la 
 * planificación de acceso de datos en discos.
 * 
 * Un fallo de página es la secuencia de eventos que ocurren cuando un 
 * programa intenta acceder a datos (o código) que está en su espacio 
 * de direcciones, pero que no está actualmente ubicado en la RAM del sistema.
 * 
 * La emulación de este algoritmo, para este código, va estar regido
 * por un valor máximo de cinco procesos.
 */

/**
 * @author Nicolás Espejo
 * 05/10/2019
 */
public class FIFO 
{	
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br = new BufferedReader (new InputStreamReader ( System.in));
			int x = 0;
			Funciones fn = new Funciones();
			
			System.out.println("En cualquier momento, ingrese '-1' para acabar el programa.");
			while (true)
			{
				System.out.print("Ingrese el número de proceso a añadir: ");
				x = Integer.parseInt(br.readLine());
				if (x == -1)
					break;
				fn.add(x);
			}	
		} catch (Exception ex) {}
		
	}
	
}

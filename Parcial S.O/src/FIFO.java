import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Algoritmo FIFO utilizado como algoritmo de reemplazo de p�ginas en la 
 * planificaci�n de acceso de datos en discos.
 * 
 * Un fallo de p�gina es la secuencia de eventos que ocurren cuando un 
 * programa intenta acceder a datos (o c�digo) que est� en su espacio 
 * de direcciones, pero que no est� actualmente ubicado en la RAM del sistema.
 * 
 * La emulaci�n de este algoritmo, para este c�digo, va estar regido
 * por un valor m�ximo de cinco procesos.
 */

/**
 * @author Nicol�s Espejo
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
				System.out.print("Ingrese el n�mero de proceso a a�adir: ");
				x = Integer.parseInt(br.readLine());
				if (x == -1)
					break;
				fn.add(x);
			}	
		} catch (Exception ex) {}
		
	}
	
}

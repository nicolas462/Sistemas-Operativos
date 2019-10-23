import java.util.Random;

/**
 * Algoritmo FIFO utilizado como algoritmo de planificación de acceso de datos en discos. 
 */

/**
 * @author Nicolás Espejo
 * 05/10/2019
 */
public class FIFO 
{	
	public static void main(String[] args) 
	{
		Random rd = new Random();
		int temp = 0, pista = 0;
		double totalPistas = 0;
		for (int i = 0; i < 10; i++) 
		{
			if (i == 0)
			{
				pista = rd.nextInt(500) + 1;
				System.out.println("\t\tPista inicial: " + pista);
				temp = pista;
				pista = rd.nextInt(500) + 1;
				System.out.print("Pista siguiente: " + pista);
				System.out.println("\tN. pistas recorridas: " + (Math.abs(temp - pista)));
				totalPistas += Math.abs(temp - pista);
			}
			else
			{
				temp = pista;
				pista = rd.nextInt(500) + 1;
				System.out.print("Pista siguiente: " + pista);
				System.out.println("\tN. pistas recorridas: " + (Math.abs(temp - pista)));
				totalPistas += Math.abs(temp - pista);
			}
		}
		System.out.println("\t\tTiempo medio de búsqueda: " + (totalPistas/10));
	}
	
}

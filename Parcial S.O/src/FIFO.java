import java.util.LinkedList;

/**
 * Algoritmo FIFO utilizado como algoritmo de reemplazo de p�ginas en la 
 * planificaci�n de acceso de datos en discos.
 * 
 * Fallo de p�gina: Un fallo de p�gina es la secuencia de eventos que 
 * ocurren cuando un programa intenta acceder a datos (o c�digo) que 
 * est� en su espacio de direcciones, pero que no est� actualmente 
 * ubicado en la RAM del sistema.
 * 
 * La emulaci�n de este algoritmo para este c�digo, va estar regido
 * por una co
 */

/**
 * @author Nicol�s Espejo
 * 05/10/2019
 */
public class FIFO 
{	
	public static void main(String[] args) 
	{
		Funciones fn = new Funciones();
		LinkedList cola = new LinkedList(); //poll, peek, offer
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		
		/*for (int i= 0; i < 3 ; i++) {
			System.out.println(cola.peek());
		cola.poll();}*/
		System.out.println(cola.size());
	}
	
}

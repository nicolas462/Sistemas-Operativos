import java.util.LinkedList;

/**
 * Algoritmo FIFO utilizado como algoritmo de reemplazo de páginas en la 
 * planificación de acceso de datos en discos.
 * 
 * Fallo de página: Un fallo de página es la secuencia de eventos que 
 * ocurren cuando un programa intenta acceder a datos (o código) que 
 * está en su espacio de direcciones, pero que no está actualmente 
 * ubicado en la RAM del sistema.
 * 
 * La emulación de este algoritmo para este código, va estar regido
 * por una co
 */

/**
 * @author Nicolás Espejo
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

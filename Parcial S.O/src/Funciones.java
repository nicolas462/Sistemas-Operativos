import java.util.LinkedList;

/**
 * @author Nicolás Espejo
 *
 */
public class Funciones {
	private LinkedList<Integer> cola = new LinkedList<Integer>();
	
	/** Verifica si hay menos de 5 datos en la cola. */
	private boolean checkSize ()
	{
		if (this.cola.size() < 5)
			return true;
		return false;
	}
	
	/** Verifica si el número ingresado 'x' está en la cola. */
	private boolean isNumber (int x)
	{
		for (int i = 0; i < this.cola.size(); i++)
			if (x == this.cola.get(i))
				return true;
		return false;
	}
	
	/** Imprime la lista. */
	private void print ()
	{
		for (int i = 0; i < this.cola.size(); i++)
		{
			System.out.print("["+this.cola.get(i)+"]" + "\t");
			if (i == (cola.size() - 1))
				System.out.println();
		}
	}

	/** Añade parámetros a la cola. */
	public void add (int x)
	{
		System.out.println("--------------------------------");
		if (isNumber(x)) // Si el número está, el número no se añade.
		{
			System.out.println("No hay fallo de página, proceso en pie.");
			print();
		}
		else if (checkSize()) // Si el número se puede añadir por espacio disponible, se hace.
		{
			this.cola.offer(x);			
			System.out.println("Proceso agregado.");
			print();
		}
		else // Se elimina el primero en entrar, y se ingresa uno nuevo.
		{
			System.out.println("Fallo de página, proceso añadido.");
			this.cola.poll();
			this.cola.offer(x);
			print();
		}
				
	}
}

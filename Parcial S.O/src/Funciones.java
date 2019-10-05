import java.util.LinkedList;

/**
 * @author Nicolás Espejo
 *
 */
public class Funciones {
	private LinkedList<Integer> cola = new LinkedList<Integer>();
	
	/** No permite ingresar más parámetros cuando hay cinco. */
	private boolean check ()
	{
		if (this.cola.size() <= 5)
			return true;
		return false;
	}
	
	/** Imprime la lista. */
	public void print ()
	{
		for (int i = 0; i < this.cola.size(); i++)
			System.out.print(this.cola.get(i));
	}

	/** Añade parámetros a la cola. */
	public void add (int x)
	{
		this.cola.offer(x);
	}
}

import java.util.LinkedList;

/**
 * @author Nicol�s Espejo
 *
 */
public class Funciones {
	private LinkedList<Integer> cola = new LinkedList<Integer>();
	
	/** No permite ingresar m�s par�metros cuando hay cinco. */
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

	/** A�ade par�metros a la cola. */
	public void add (int x)
	{
		this.cola.offer(x);
	}
}

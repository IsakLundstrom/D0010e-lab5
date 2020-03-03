package lab5.instore;

	

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author Arian Masoudi, Hjalmar, Isak, Tovah
 * 
 *         The FIFO class is a First in first out list.
 *
 */
public class FIFO
{

	// Array storing objects
	ArrayList<Object> elementArr = new ArrayList<Object>();

	// Original size for array since created
	private int orgSize = 0;

	// Boolean to compare elements in arrays
	private boolean compare;

	// Update methods

	/**
	 * This method adds the object to the end of the queue and saves the biggest
	 * amount
	 * 
	 * @param item
	 */
	public void add(Object item)
	{
		// Adds object to the end of the queue
		elementArr.add(item);

		if (orgSize < elementArr.size())
		{
//			orgSize = elementArr.size();
			orgSize += 1;
		}
	}

	/**
	 * This method removes the first object from the queue. If the queue is empty a
	 * NoSuchElementException is thrown.
	 */
	public void removeFirst()
	{
		try
		{
			elementArr.remove(0);
		} catch (Exception IndexOutOfBoundsException)
		{
			throw new NoSuchElementException();
		}
	}

	// Query methods

	/**
	 * Returns number of elements in this queue
	 * 
	 * @return Queue size
	 */
	public int size()
	{
		return elementArr.size();
	}

	/**
	 * Returns maximum size the queue has had since created
	 * 
	 * @return max size
	 */
	public int maxSize()
	{
		return orgSize;
	}

	// Returns true if and only if the size of the queue 0, otherwise false
	public boolean isEmpty()
	{
		if (elementArr.size() == 0)
		{
			return true;
		}
		return false;
	}

	/**
	 * This method returns the first element in the queue. If the queue is empty, a
	 * NoSuchElementException is thrown.
	 * 
	 * @return
	 */

	public Object first()
	{
		try
		{
			return elementArr.get(0);
		} catch (Exception IndexOutOfBoundsException)
		{
			throw new NoSuchElementException();
		}
	}

	/**
	 * This method throws a ClassCastException if f is not of the same type as this
	 * class. This method returns true if, and only if, all the following holds:
	 * 
	 * this and f have the same size.
	 * 
	 * For every position i in this queue:
	 * 
	 * If the element at position i is null, the corresponding element at position i
	 * in f also is null.
	 * 
	 * If the element at position i instead is a reference to an object obj1, the
	 * corresponding element at position i in f is also a reference to an object
	 * obj2, and obj1.equals(obj2) is true.
	 * 
	 * Otherwise, this method returns false. In particular, it does not throw any
	 * exception, such as a ClassCastException.
	 */
	public boolean equals(Object f)
	{
		// If objects are of the same class
		if (f.getClass() == this.getClass())
		{
			// create newf which is of type FIFO if they are of same class
			FIFO newf = (FIFO) f;

			// Compare size and type and if the type is the same, only then return true
			if (this.size() == newf.size() && compare(newf))
			{
				return true;
			} else
			{
				return false;
			}
		} else
		{
			throw new ClassCastException();
		}
	}

	/**
	 * This method is a help method for comparing the type of the elements in array
	 * 
	 * @param f
	 * @return
	 */
	private boolean compare(FIFO f)
	{
		for (int i = 0; i < elementArr.size(); i++)
		{
			// If any of of the elements are null
			if (this.elementArr.get(i) == null || f.elementArr.get(i) == null)
			{
				// Elements that are different have to be identical
				if (this.elementArr.get(i) != null || f.elementArr.get(i) != null)
				{
					return false;
				}
			}

			// If none of the elements are null and of the same type.
			else if (!(this.elementArr.get(i).equals((f.elementArr.get(i)))))
			{
				// If a non match found return false
				return false;
			}
		}
		// Otherwise match has been found and return true
		return true;
	}

	/**
	 * This method returns a string beginning with "Queue: " followed by the
	 * following, for each element elem in the queue:
	 * 
	 */
	public String toString()
	{
		String Q = "[";
		for (int i = 0; i < elementArr.size(); i++)
		{
			Q += "(" + String.valueOf(elementArr.get(i)) + ") ";
		}
		return Q + "]";
	}

}

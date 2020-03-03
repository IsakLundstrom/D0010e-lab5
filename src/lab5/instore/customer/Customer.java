package lab5.instore.customer;

/**
 * @author Arian Masoudi, Hjalmar, Isak, Tovah
 * 
 *         Represents a customer with an unique ID.
 */
public class Customer
{
	private int ID;

	/**
	 * Constructor
	 * 
	 * @param ID
	 */
	Customer(int ID)
	{
		this.ID = ID;
	}

	/**
	 * Getter for customer ID
	 * 
	 * @return ID for each customer
	 */
	public int getID()
	{
		return ID;
	}

}

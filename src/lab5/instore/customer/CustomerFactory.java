package lab5.instore.customer;

/**
 * @author Arian Masoudi, Hjalmar, Isak, Tovah
 *
 *         When a customer is created with class Customer, this class assigns
 *         each customer with an unique ID
 */
public class CustomerFactory
{
	private int ID = 0;

	/**
	 * Constructor returns a new created customer and increments by one with each
	 * created customer
	 * 
	 * @return A new created Customer
	 */
	public Customer CustomerFactory()
	{
		return new Customer(ID++);
	}

}
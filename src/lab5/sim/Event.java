package lab5.sim;

/**
 * @author Arian Masoudi
 *
 */
public abstract class Event
{

	//
	public double startTime;

	//
	public abstract void execute();

	//
	public abstract double getTime();

}

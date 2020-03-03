package lab5.instore.event;

import lab5.sim.Event;


/**
 * @author Arian Masoudi
 *
 */
public class ArriveEvent extends Event
{


	
	public ArriveEvent(double startTime) 
	{
		this.startTime = startTime;
		
	}
	
	@Override
	public void execute()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTime()
	{
		return this.startTime;
	}



}

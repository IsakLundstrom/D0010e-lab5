package lab5.sim;

import java.util.ArrayList;

/**
 * @author Arian Masoudi, Hjalmar, Isak, Tovah
 *
 */
public class EventQueue
{

	ArrayList<Event> eventQueue;

	/**
	 * Constructor creates new eventQueue
	 */
	public EventQueue()
	{
		eventQueue = new ArrayList<Event>();
	}

//	/**
//	 * Add and sort events t queue
//	 * 
//	 * @param e Event
//	 */
//	public void add(Event e)
//	{
//		eventQueue.add(e);
//		eventSort(e);
//	}

	/**
	 * Returns the queue
	 * 
	 * @return eventQueue
	 */
	public ArrayList<Event> getEventQueue()
	{
		return eventQueue;
	}

	/**
	 * Removes first event in eventQueue
	 */
	public void removeFirstEvent()
	{
		eventQueue.remove(0);
	}

	/**
	 * Method for adding and sorting events
	 * 
	 * @param e Event
	 */
	public void addAndSortEvent(Event e)
	{
		ArrayList<Event> updatedEventQueue = new ArrayList<Event>();

		for (int i = 0; i < eventQueue.size(); i++)
		{
			if (eventQueue.get(i).getTime() <= e.getTime())
			{
				updatedEventQueue.add(eventQueue.get(i));
			}
		}
		updatedEventQueue.add(e);

		for (int i = 0; i < eventQueue.size(); i++)
		{
			if (eventQueue.get(i).getTime() > e.getTime())
			{
				updatedEventQueue.add(eventQueue.get(i));
			}
		}
		eventQueue = updatedEventQueue;
	}

}

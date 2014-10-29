import java.util.ArrayList;


public class Printer implements Runnable {
	
	private ArrayList<String> printQueue;
	
	public Printer()
	{
		printQueue = new ArrayList<String>();
	}
	
	public void print()
	{
		System.out.println(printQueue.get(0));
		printQueue.remove(0);
		
	}

	
	public void receivePrint(ThoseThatWishToPrint person)
	{
		int idNumb = person.getID();
		int printNumb = person.getPrintsPerformed();
		
		printQueue.add("Person #" + idNumb + " is sending print job #" + printNumb);

	}
	
	public void run()
	{
		
		
		while(true)
		{
			if(printQueue.size() != 0)
				this.print();
			else
			{
				try {
					Thread.sleep(5000);			// someDuration is some number of milliseconds
					}
					catch( InterruptedException e ) {
					e.printStackTrace();
					}
			}
			try {
				Thread.sleep(2000);			// someDuration is some number of milliseconds
				}
				catch( InterruptedException e ) {
				e.printStackTrace();
				}
		}
	}
	
	
	
	
	

}

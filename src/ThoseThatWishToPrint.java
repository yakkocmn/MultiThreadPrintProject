
public class ThoseThatWishToPrint implements Runnable {

	private int id;
	private int printsPerformed;
	private static int howMany = 1;
	private Printer theirPrinter;

	public ThoseThatWishToPrint(Printer p)
	{
		id = howMany;
		howMany++;
		printsPerformed = 1;
		theirPrinter = p;
	}
	
	public int getID()
	{
		return id;
	}
	
	public int getPrintsPerformed()
	{
		return printsPerformed;
	}
	
	public void sendPrintJob()
	{
		theirPrinter.receivePrint(this);
		
		
		
		
	}
	
	public void run()
	{
		while(true)
		{
			sendPrintJob();
			printsPerformed++;
			int sleepTime = (int)(Math.random()*16) + 5;
			
		try {
			Thread.sleep(sleepTime);			// someDuration is some number of milliseconds
			}
			catch( InterruptedException e ) {
			e.printStackTrace();
			}
		}
		
	}
}

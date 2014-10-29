
public class MainPrint {

	public static void main(String[] args) {
		Printer mainPrinter = new Printer();
		ThoseThatWishToPrint personA = new ThoseThatWishToPrint(mainPrinter);
		ThoseThatWishToPrint personB = new ThoseThatWishToPrint(mainPrinter);
		ThoseThatWishToPrint personC = new ThoseThatWishToPrint(mainPrinter);
		
		Thread printThread = new Thread(mainPrinter);
		Thread p1Thread = new Thread(personA);
		Thread p2Thread = new Thread(personB);
		Thread p3Thread = new Thread(personC);
		
		printThread.start();
		p1Thread.start();
		p2Thread.start();
		p3Thread.start();

	}

}

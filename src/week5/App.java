package week5;

public class App {

	public static void main(String[] args) {
		//System.out.println("Testing out my logger!" + "\n");

		//instancing AsteriskLogger{}
		Logger asteriskLogger = new AsteriskLogger();
		
		//using the asteriskLogger object
		asteriskLogger.log("Testing for video");
		System.out.println("\n");
		asteriskLogger.error("This is an asterisk error!");
		System.out.println("\n");
		
		Logger spacedLogger = new SpacedLogger();
		
		//using the spacedLogger object
		spacedLogger.log("We're going to spaaaaace");
		System.out.println("\n");
		spacedLogger.error("You failed to take off but you're floaty");
		System.out.println("\n");
	}

}
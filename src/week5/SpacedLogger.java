package week5;

public class SpacedLogger implements Logger {
	//The SpacedLogger should add spaces
	//between each character of the String argument passed into its methods
	
	@Override
	public void log(String log) {
		System.out.println(getSpacedString(log));
	}
		
	//Originally I had this body inside my log()
	//StringBuilder sb = new StringBuilder();
	//for (char c : log.toCharArray()) {
	//sb.append(c).append(" ");
	//}
	//system.out.println(sb.toString().trim());
	//Then I realized I would be doing the same thing inside error() so I decided to 
	//create a new method that both log() and error() can use
		
		
		
	//The error method should do the same, but with “ERROR:” preceding the spaced
	//out input
	@Override
	public void error(String error) {
		System.out.println("Error:" + getSpacedString(error));	
		}
	
	//This method is private because it's only being used by SpacedLogger{}
	//It's purpose is to return a spaced string, so return type is String
	//The argument is type String since both log() and error() will receive a string 
	//and they can pass the sting into getSpacedString
	//This was my first time using the alternate for loop that can traverse arrays and 
	//I'm glad to be able to use this more elegant approach
	//There are may ways to approach string concatenation but since I wanted to 
	//use StringBuilder in this assignment I used the append() method
	//While researching StringBuilder I saw a method trim() that lets me remove 
	//the unnecessary space at the end of my spaced string that is inevitably produced 
	//by the for loop
	
	private String getSpacedString(String myMessage) { 
		StringBuilder sb = new StringBuilder();
		
		for (char c : myMessage.toCharArray()) {
			sb.append(c).append(" ");
		}
		
		return sb.toString().trim();
	}
}

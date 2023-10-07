package week5;

public class AsteriskLogger implements Logger {

	//My understanding is that these implementations must be public to be accessible by App{}
	//Even though I didn't have to specify access to these methods in the interface, 
	//my code gives access error if I omit "public" access modifier
	
	//The log method on the AsteriskLogger should print out the String it receives
	//between 3 asterisks on either side of the String (e.g. if the String passed in is
	//“Hello”, then it should print ***Hello*** to the console).
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	
	//The error method on the AsteriskLogger should print the String it receives inside
	//a box of asterisks, with the String preceded by the word “ERROR:”.
	//--first was done using for loop to append to a string of asterisks, but since strings
	//are immutable, I redid this to be more efficient with StringBuilder
	//--since I was researching StringBuilder methods, I saw one that lets me reuse the asterisk
	//string sb by printing only 3 of its asterisks.
	//--since I had full control of the indexes I was using in this, I didn't do try catch 
		
	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i <= error.length()+11; i++) {
			sb.append("*");
		}
	
		System.out.println(sb.toString());
		System.out.println(sb.substring(0,3) + "Error:" + error + sb.substring(0,3));
		System.out.println(sb.toString());
	}

}

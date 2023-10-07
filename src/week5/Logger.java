package week5;

public interface Logger {
	
	//declaring requested methods log() and error()
	//methods were required to be void and take String as parameters
	
	//trying to justify my decisions I looked up what kind of access interface methods
	//require
	
	//From https://docs.oracle.com/javase/specs/jls/se9/html/jls-9.html#jls-9.4
	//A method in the body of an interface may be declared public or private (§6.6). 
	//If no access modifier is given, the method is implicitly public. It is permitted, but 
	//discouraged as a matter of style, to redundantly specify the public modifier for
	//a method declaration in an interface.
	
	void log (String log);
	void error (String error);
	
}

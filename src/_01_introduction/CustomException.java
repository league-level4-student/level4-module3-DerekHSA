package _01_introduction;

public class CustomException extends Exception {
	public CustomException(){
		terminate();
	}
void terminate() {
	System.exit(0);
}
}

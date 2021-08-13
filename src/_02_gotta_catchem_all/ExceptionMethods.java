package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double devide(double num, double den) throws Exception {
		if (den<=0) {
			throw new Exception();
		}
		return num/den;
	}
	public static String reverseString(String reverse) throws Exception{
		if (reverse=="") {
			throw new Exception();
		}
		String temp = "";
		for (int i = reverse.length()-1; i >-1; i--) {
			temp+=reverse.charAt(i);
		}
		
		
		return temp;
	}
}

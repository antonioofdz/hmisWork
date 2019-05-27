package Ejercicio3;

public class Ejercicio3 {

	private static final String fiveAsterisks = "*****", 
			twelveAsterisks = "***********",
			errMsg = "Error";
	public String numberToAsterisk(int value) {
		String result = "";
		if (value < 0) {
			result = errMsg;
		}else if (value < 6) {
			result = fiveAsterisks;
		}else if(value > 13) {
			result = twelveAsterisks;
		}else {
			for(int i = 0; i < value; i++) {
				result += "*";
			}
		}		
		return result;		
	}
	
}

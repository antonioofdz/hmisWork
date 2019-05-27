package Ejercicio4;

public class Ejercicio4 {
	public String checkChainValue(String value, String chain) {
		String resultChain  = "";
		for (int i = 0; i < value.length(); i++) {
			char actually = value.charAt(i);
			if (chain.indexOf(actually) >=0) {
				resultChain += actually;
			}
		}
		return resultChain;
	}
}

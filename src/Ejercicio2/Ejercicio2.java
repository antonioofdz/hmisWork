package Ejercicio2;

public class Ejercicio2 {
	public boolean login(String username, String password) {
		if (username.isEmpty() || password.isEmpty()) {
			return false;
		}else if(username.length() > 29 || password.length() > 29) {
			return false;
		}
		
		return compruebaLoginEnBD(username, password);
	}

	public boolean compruebaLoginEnBD(String username, String password) {

		if (username.equals("user") && password.equals("pass"))
			return true;
		else
			return false;
	}
}

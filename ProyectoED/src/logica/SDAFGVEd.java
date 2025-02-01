package logica;

public class SDAFGVEd {
	public static void main(String[] args) {
		
		
		Systema sistema= new Systema("abc");
		boolean registrado= sistema.registrarse("Jose","123456788", "Cuba", "Ingeniero");
		System.out.println(registrado);
		System.out.println(sistema.login("Jose","123456788"));
	}

}

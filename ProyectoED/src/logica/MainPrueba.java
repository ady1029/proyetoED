package logica;

public class MainPrueba {

	public static void main(String[] args) {
		Systema sistema= new Systema("abc");
		boolean registrado= sistema.registrarse("Jose","123456788", "Cuba", "Ingeniero");
		System.out.println(registrado);

	}

}

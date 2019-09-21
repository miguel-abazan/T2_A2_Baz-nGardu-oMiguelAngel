import java.util.Scanner;

class Vocales{
	public int vocales(String cad) { 
	if (cad.length() == 0) {
		return 0;
	}
	switch (Character.toLowerCase(cad.charAt(cad.length() - 1))) {
		case 'a':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'e':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'i':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'o':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
		case 'u':
			return 1 + vocales(cad.substring(0, cad.length() - 1));
	}
	return 0 + vocales(cad.substring(0, cad.length() - 1));
}
}
public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner (System.in);
		Vocales ob1 = new Vocales();
		System.out.print("Ingrese el texto");
		String cadena = e.nextLine();
		System.out.println(ob1.vocales(cadena));
		
	}

}

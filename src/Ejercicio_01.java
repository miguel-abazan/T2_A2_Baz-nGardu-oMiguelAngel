import java.util.Scanner;

class Div{
	public int division(int dividendo, int divisor) { 
        if(dividendo<divisor)
            return 0;
        else
            return 1+division(dividendo-divisor, divisor);
    }
}
public class Ejercicio_01 {

	public static void main(String[] args) {
	Scanner e = new Scanner(System.in);
	int divisor=0;
	int dividendo=0;
	DivDosNum ob1= new DivDosNum();
		System.out.println("Ingresa el divisor");
		divisor=e.nextInt();
		System.out.println("Ingresar el Dividendo");
		dividendo=e.nextInt();
		System.out.println("division es "+ ob1.division(dividendo, divisor));
		
	}

}

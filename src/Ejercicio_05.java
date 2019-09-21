import java.util.Scanner;

class NumABin{
	public int Numeroabinario(int num){
	if (num / 2 != 1)
	return Numeroabinario(num / 2) + num % 2;
	else
	return 1 + num%2;
	}
}
public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner e=new Scanner(System.in);

int num=0;


		NumABin ob1=new NumABin();
		System.out.println("Ingrese numero a convertir");
num=e.nextInt();
System.out.println(ob1.Numeroabinario(num));
	}

}

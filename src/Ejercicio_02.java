import java.util.Scanner;

class NumeroFactorial{
	
	public long factorialRecursivo(long n){
        
        if(n==1){
            
            return 1;
        }else
            
        	return  n * factorialRecursivo(n-1);
        
         
        
         
    }
}
public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner e =new Scanner(System.in);
		NumeroFactorial ob1 = new NumeroFactorial();
		System.out.println("Ingresa numero:");
		long n=e.nextLong();
		System.out.println(ob1.factorialRecursivo(n));
	
	
		

	}

}

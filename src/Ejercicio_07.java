import java.util.Scanner;

class CadenaInv{
	public String invertirPalabra(String palabra, int tam){ 
        if(tam==0){
            return palabra.charAt(tam)+"";
        }else{
            return palabra.charAt(tam) + (invertirPalabra(palabra, tam-1));
        }
    }
}
public class Ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CadenaInv ob1= new CadenaInv();
Scanner e = new Scanner(System.in);
String palabra="";
System.out.println("ingrese cadena");
palabra=e.nextLine();
System.out.println(ob1.invertirPalabra(palabra, palabra.length()-1));
	
	
	
	}

}

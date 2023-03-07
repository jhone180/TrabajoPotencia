
import java.util.Scanner;

public class CalcularPotencia {
    
    public static void main(String [] args){
	
	Scanner Lectura = new Scanner(System.in);
	
	System.out.print("Indique el numero base: ");
	int base = Lectura.nextInt();	

	System.out.print("Indique el exponente: ");
	int exponente = Lectura.nextInt();
	
        int mostrar = potencia(base, exponente);
        
        System.out.println("Resultado: " + mostrar);
    }
   
   public static int potencia(int a, int b){
       if(b == 1){
           return a;
       } else {
           return a * potencia(a, b - 1);
       }
   }
}

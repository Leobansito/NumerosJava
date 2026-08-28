import java.util.Scanner;

public class Numero{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("Por favor usuario ingrese un numero");
        numero= Double.parseDouble(sc.nextLine());
        
        if (numero % 2.0 ==0){
            System.out.println("El numero es divisible entre 2");
        }
        else{
            System.out.println("El numero no es divisible entre 2");
        }
        
    }
    
}
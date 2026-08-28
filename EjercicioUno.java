import java.util.Scanner;
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero cualquiera: ");
        int numero = Integer.parseInt(sc.nextLine()); 
        if (numero % 2 == 0){
            System.out.println("El numero si es divisible entre 2");
        }
        else{
            System.out.println("No es divisible entre 2");
        }
    }
    
}

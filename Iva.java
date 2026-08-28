import java.util.Scanner;
public class Iva {
    public static void main(String[] args) { 
            final double iva= 0.21;
            Scanner sc = new Scanner(System.in);
            System.out.print("Hola usuario dame el precio de tu producto: ");
            int producto = Integer.parseInt(sc.nextLine());
            double productoFinal= producto + (producto*iva);
            System.out.println("El precio original del producto es: "+producto + "\nEl iva aplicado es: "+ iva + "\nEl precio del producto final es: "+productoFinal);
        }
    
}

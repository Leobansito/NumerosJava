public class finalBoss {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <100){
            contador=contador+1;
            System.out.print("<"+contador+">" + ", ");
            if (contador % 2 == 0 && contador % 3 ==0){
                System.out.print("Es divisible entre ambos, ");
                continue;
            }
            else if (contador % 2 == 0){
                System.out.print("Es divisible entre 2, ");
            }
            else if (contador % 3 == 0){
                System.out.print("Es divisible entre 3, ");
            }
            else{
                System.out.println("No es divisible por ninguno, ");
            }
        }
    }
}
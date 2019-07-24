
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int primerNumero = teclado.nextInt();

        System.out.println("Ingrese segundo numero: ");
        int segundoNumero = teclado.nextInt();

        System.out.println("La suma es: "+ (primerNumero+segundoNumero));

    }
}


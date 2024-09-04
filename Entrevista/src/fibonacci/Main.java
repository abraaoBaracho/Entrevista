package fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scan.nextInt();

        scan.close();

        Fibonacci.calcularNumero(numero);

    }
}

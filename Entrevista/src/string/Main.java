package string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma String:");
        String texto = scan.nextLine();
        
        scan.close();

        Manipulacao.checarString(texto);

    }
}

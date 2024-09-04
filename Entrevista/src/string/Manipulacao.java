package string;

public class Manipulacao {

    public static void checarString(String texto) {
        String textoLow = texto.toLowerCase();
        int contador = 0;
        if (textoLow.contains("a")) {
            for (int i = 0; i < textoLow.length(); i++) {
                if (textoLow.charAt(i) == 'a') {
                    contador++;
                }
            }
            System.out.println("A letra 'a' existe e aparece " + contador + " vezes na palavra " + texto + ".");
        } else {
            System.out.println("A letra 'a' não existe na palavara " + texto + ".");
        }
    }
}

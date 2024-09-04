package soma;

public class Main {

    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 1;
        while (k < indice) {
            k += 1;

            soma += k;
        }
        System.out.println(soma);
    }
}

package fibonacci;

public class Fibonacci {
    
    public static void calcularNumero(int numero){
        if(raizPerfeita(5 * numero * numero + 4) || raizPerfeita(5 * numero * numero - 4)){
            System.out.println("O número informado pertence à sequência.");
        }else{
            System.out.println("O número informado não pertence à sequência.");
        }
       
    }

    private static boolean raizPerfeita(int i) {
       int raiz = (int) Math.sqrt(i);
        return raiz * raiz == i;
    }
}

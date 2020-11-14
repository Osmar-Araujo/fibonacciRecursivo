
package fibonacci;
import java.util.Scanner;

public class Fibonacci {
    
    static int fibonacci (int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Calculo dos termos da Sequência de Fibonacci");
        Scanner leitor = new Scanner (System.in);
        int numero;
        System.out.println("Digite um número de termos a serem exibidos: ");
        numero = leitor.nextInt();
        System.out.println("\n");
        System.out.println("Os termos correspondentes da Sequência de Fibonacci são:\n");
        
        for (int i = 1; i <=numero; i++){
            System.out.println(fibonacci(i));
        }
    }
    
}

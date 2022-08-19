package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        int numero1 = entrada.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int numero2 = entrada.nextInt();
        System.out.println("A soma dos dois valores resulta em: "+(numero1 + numero2) );
        entrada.close();
    }
}

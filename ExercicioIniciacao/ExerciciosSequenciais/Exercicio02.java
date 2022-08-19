package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Informe um numero:" );
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        System.out.println("O Numero informado foi "+ num);
        entrada.close();
    }
}

package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro : ");
        int n = entrada.nextInt();
        System.out.println("O número informado foi "+n+" e foi tranformado em: "+(n+1));
    }
}

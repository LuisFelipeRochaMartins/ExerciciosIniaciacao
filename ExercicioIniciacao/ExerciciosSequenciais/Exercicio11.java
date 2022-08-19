package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua altura: ");
        float h = entrada.nextFloat();
        System.out.println("O peso ideal da sua altura é de Kg: "+((72.7*h)-58));
        entrada.close();
    }
}
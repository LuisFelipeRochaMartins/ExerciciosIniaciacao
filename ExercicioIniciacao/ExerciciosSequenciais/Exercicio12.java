package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua altura");
        float h = entrada.nextFloat();
        System.out.println("Caso você seja homem seu peso ideal deverá ser: "+((72.7*h)-58));
        System.out.println("Caso você seja mulher seu peso ideal deverá ser: "+((62.1*h) - 44.7));
        entrada.close();
    }
}

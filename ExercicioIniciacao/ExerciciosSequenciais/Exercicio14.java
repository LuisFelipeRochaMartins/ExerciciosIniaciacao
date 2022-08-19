package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos reais você ganha por hora? ");
        float h = entrada.nextFloat();
        System.out.println("Quantas horas você trabalho por mês? ");
        float m = entrada.nextFloat();
        System.out.println(" + Salário Bruto: R$ "+(m*h));
        System.out.println(" - IR (11%): R$ "+((m*h)*0.11));
        System.out.println(" - INSS (08%): R$ "+((m*h)*0.08));
        System.out.println(" - Sindicato (05%): R$ "+((m*h)*0.05));
        System.out.println("   Seu salário líquido é de R$: "+((m*h)-((m*h)*0.11)-((m*h)*0.08)-((m*h)*0.05)));
        entrada.close();
    }
}

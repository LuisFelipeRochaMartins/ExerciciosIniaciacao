package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos R$ você ganha por hora?");
        float hora = entrada.nextFloat();
        System.out.println("Quantos horas você trabalha por mês");
        int mes = entrada.nextInt();
        System.out.println("O seu salário é de: R$ "+(hora*mes));
        entrada.close();
    }
}

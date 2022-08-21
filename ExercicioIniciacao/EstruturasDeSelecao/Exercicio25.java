package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        float n = entrada.nextFloat();
        if (n%1==0){
            System.out.println("Inteiro");
        }
        else{
            System.out.println("Decimal");
        }
    }
}

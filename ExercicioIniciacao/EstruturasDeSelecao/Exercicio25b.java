package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio25b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = entrada.nextInt();
        if (n%2==0){
            System.out.println(n+" é Par");
        }
        else{
            System.out.println(n+"é Impar");
        }
    }
}

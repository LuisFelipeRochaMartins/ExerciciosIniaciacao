package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um ano: ");
        int ano = entrada.nextInt();
        if ((ano&4)==0 && (ano%100!=0) || ((ano%400==0))) {
            System.out.println("Bissexto");
        }
        else{
            System.out.println("Não é Bissexto");
        }
    }
}


package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = entrada.nextInt();
        if(n>0){
            System.out.println(n+" é um número Positivo");
        }
        else if (n<0){
            System.out.println(n+" é um número Negativo");
        }
        else{
            System.out.println(n+"é igual a Zero!");
        }
        entrada.close();
    }
}

package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro menor que 1000: ");
        int n = entrada.nextInt();
        if (n>1000 || n<0){
            System.out.println("Número inválido");
        }
        else{
            System.out.println("A quantidade de Centenas desse número é:"+(n/100));
            System.out.println("A quantidade de dezenas desse número é:"+((n%100)/10));
            System.out.println("A quantidade de Unidades desse número é:"+n%10);

        }
    }
}

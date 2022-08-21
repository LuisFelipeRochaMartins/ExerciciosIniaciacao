package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = entrada.nextInt();
        if (n1>n2){
            System.out.println("O maior número entre "+n1+" e "+n2+"é"+n1);
        }
        else if (n2>n1){
            System.out.println("O maior número entre "+n1+" e "+n2+"é"+n2);
        }
        else{
            System.out.println("Os dois números são iguais à:"+n1);
        }
    }

}

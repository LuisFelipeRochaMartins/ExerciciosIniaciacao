package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro lado do Triângulo: ");
        int l1 = entrada.nextInt();
        System.out.println("Informe o segundo lado do Triângulo: ");
        int l2 = entrada.nextInt();
        System.out.println("Informe o terceiro lado do Triângulo: ");
        int l3 = entrada.nextInt();
        if ((l1+l2 > l3) && (l1+l3 > l2) && (l2+l3 > l1)){
            System.out.print("É um triângulo ");
            if ((l1==l2) ||(l1==l3)){
                System.out.println("equilátero");
            }
            else if ((l1==l2) || (l1==l3) || (l2==l3)){
                System.out.println("isóceles");
            }
            else {
                System.out.println("escaleno");
            }
        }
        else{
            System.out.println("Esses lados não formam um triângulo");
        }
    }
}

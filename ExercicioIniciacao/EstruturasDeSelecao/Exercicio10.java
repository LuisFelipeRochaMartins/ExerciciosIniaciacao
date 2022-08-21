package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n1 = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite novamente outro número: ");
        int n3 = entrada.nextInt();
        if (n1>n2 && n1>n3){
            if (n2>n3){
                System.out.println("Maior número dentre os informados é: "+n1);
                System.out.println("Menor número dentre os informados é: "+n3);
            }
            else{
                System.out.println("Maior número dentre os informados é: "+n1);
                System.out.println("Menor número dentre os informados é: "+n2);
            }
        }
        else if (n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println("Maior número dentre os informados é: "+n2);
                System.out.println("Menor número dentre os informados é: "+n3);
            }
            else{
                System.out.println("Maior número dentre os informados é: "+n2);
                System.out.println("Menor número dentre os informados é: "+n1);
            }
        }
        else if(n3>n1 && n3>n2){
            if(n1>n2){
                System.out.println("Maior número dentre os informados é: "+n3);
                System.out.println("Menor número dentre os informados é: "+n2);
            }
            else {
                System.out.println("Maior número dentre os informados é: "+n3);
                System.out.println("Menor número dentre os informados é: "+n1);
            }
        }
    }
}

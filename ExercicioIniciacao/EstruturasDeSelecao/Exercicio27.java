package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n = entrada.nextFloat();
        System.out.println("Digite outro número: ");
        float n2 = entrada.nextFloat();
        System.out.print("Informe o que deseja fazer :"
        +"\n1 para Impar ou Par"
        +"\n2 para Positivo ou Negativo"
        +"\n3 para Inteiro ou Decimal.");
        int op = entrada.nextInt();
        if (op==1){
            if (n%2==0){
                System.out.println(n+" é Par");
            }
            else{
                System.out.println(n+" é Impar");
            }
            if (n2%2==0){
                System.out.println(n2+" é Par");
            }
            else{
                System.out.println(n2+" é Impar");
            }
        }
        else if (op==2) {
            if (n > 0) {
                System.out.println(n + " é Positivo ");
            } else if (n < 0) {
                System.out.println(n + " é Negativo");
            }
            if (n2 > 0) {
                System.out.println(n2 + " é Positivo ");
            } else if (n < 0) {
                System.out.println(n2 + " é Negativo");
            }
        }
        else if (op==3){
            if (n%1==0){
                System.out.println(n+" é Inteiro");
            } else{
                System.out.println(n+" é Decimal");
            }
            if (n2%1==0){
                System.out.println(n+" é Inteiro");
            } else{
                System.out.println(n+" é Decimal");
            }
        } else{
            System.out.println("Opção inválida");
        }
    }
}

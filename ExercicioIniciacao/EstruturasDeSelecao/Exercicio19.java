package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma equação do segundo grau:");
        System.out.println("ax^2: ");
        double a = entrada.nextInt();
        System.out.println("bx: ");
        double b = entrada.nextInt();
        System.out.println("c: ");
        double c = entrada.nextInt();
        if (a!=0){
            if (b*b-4*a*c>0){
                System.out.println("A primeira raiz dessa equação é:"+(((-b)+Math.sqrt((b*b-(4*a*c))))/2*a));
                System.out.println("A segunda raiz dessa equação é:"+(((-b)-Math.sqrt((b*b-(4*a*c))))/2*a));
            }
            else if (b*b-4*a*c==0){
                System.out.println("Essa equação possui somente uma raiz: "+(((-b)+Math.sqrt((b*b-(4*a*c))))/2*a));
            }
            else {
                System.out.println("Essa equação não possui raizes reais.");
            }
        }
        else {
            System.out.println("Não é equação do segundo grau.");
        }
    }
}

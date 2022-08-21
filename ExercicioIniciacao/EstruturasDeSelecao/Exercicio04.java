package ExercicioIniciacao.EstruturasDeSelecao;
import  java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = entrada.nextInt();
        if((ano%4==0 && ano%400==0)|| ano%100==0){
            System.out.println(ano+" é Bissexto");
        }
        else{
            System.out.println(ano+" não é Bissexto");
        }
    }
}
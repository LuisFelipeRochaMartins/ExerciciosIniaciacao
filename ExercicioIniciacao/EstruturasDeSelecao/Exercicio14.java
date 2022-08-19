package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o dia conforme os numeros 1 ate 7: ");
        int num = entrada.nextInt();
        if (num == 1){
            System.out.println("Domingo!");
        }
        else if (num == 2){
            System.out.println("Segunda-feira");
        }
        else if (num == 3){
            System.out.println("Terca-feira");
        }
        else if (num == 4){
            System.out.println("Quarta-feira");
        }
        else if (num == 5){
            System.out.println("Quinta-feira");
        }
        else if (num == 6){
            System.out.println("Sexta-feira");
        }
        else if (num == 7){
            System.out.println("Sabado");
        }
        else{
            System.out.println("numero invalido favor reinicie o codigo");
        }

    }
}
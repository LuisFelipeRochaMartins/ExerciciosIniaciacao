package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que período do dia você estuda? ");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        String turno = entrada.nextLine();
        if("m".equalsIgnoreCase(turno)){
            System.out.println("Bom dia!");
        }
        else if ("v".equalsIgnoreCase(turno)){
            System.out.println("Boa tarde!");
        }
        else if("n".equalsIgnoreCase(turno)){
            System.out.println("Boa noite!");
        }
    }
}

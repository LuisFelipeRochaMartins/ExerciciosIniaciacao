package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = entrada.nextLine();
        if ("a".equalsIgnoreCase(letra)||"e".equalsIgnoreCase(letra)||"i".equalsIgnoreCase(letra)||"o".equalsIgnoreCase(letra)||"u".equalsIgnoreCase(letra)){
            System.out.println(letra+" é uma Vogal!");
        }
        else{
            System.out.println(letra+" não é vogal!");
        }
    }
}

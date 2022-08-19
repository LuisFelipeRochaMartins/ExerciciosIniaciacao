package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit que deseja converter: ");
        float f = entrada.nextFloat();
        System.out.println("A temperatura em Celsius é igual à: "+((f-32)*5/9));
        entrada.close();
    }
}

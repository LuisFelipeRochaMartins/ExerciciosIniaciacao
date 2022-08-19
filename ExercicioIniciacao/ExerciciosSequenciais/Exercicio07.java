package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o tamanho da aresta");
        float aresta = entrada.nextFloat();
        System.out.println("A área desse quadrado é:"+(aresta*aresta));
        entrada.close();
    }
}
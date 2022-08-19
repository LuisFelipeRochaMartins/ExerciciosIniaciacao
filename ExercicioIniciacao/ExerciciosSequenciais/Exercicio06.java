package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Informe o raio do circulo");
        Scanner entrada = new Scanner(System.in);
        float raio = entrada.nextFloat();
        System.out.println("A área desse circulo é igual a:"+(3.14*(raio*raio)));
        entrada.close();
    }
}

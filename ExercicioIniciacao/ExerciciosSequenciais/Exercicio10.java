package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero1 = entrada.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int numero2 = entrada.nextInt();
        System.out.println("Informe um número real: ");
        float numero3 = entrada.nextInt();
        System.out.println("O produto do dobro do primeiro com metade do segundo é igual à: "+((numero1*2)*numero2/2));
        System.out.println("A soma do triplo do primeiro com o terceiro."+((numero1*3)+numero3));
        System.out.println("O terceiro elevado ao cubo."+ (numero3*numero3*numero3));
        entrada.close();
    }
}
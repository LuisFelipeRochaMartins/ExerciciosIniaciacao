package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a área que deseja pintar: [m^2]");
        float a = entrada.nextFloat();
        //Arrendonda para cima caso de um valor decimal.
        System.out.print("A quantidade de latas que serão necessárias é de : "+ Math.ceil(a/54));
        System.out.println(" e precisará de R$ "+ (Math.ceil(a/54)*80));
        entrada.close();
    }
}


package ExercicioIniciacao.ExerciciosSequenciais;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o peso do peixe: ");
        float p = entrada.nextFloat();
        if (p > 50){
            float m = ((p-50)*4);
            float exe = (p-50);
            System.out.println("A taxa cobrada será de R$: "+m);
            System.out.println("Teve um excesso de "+exe+" Kg.");
        }
        else{
            System.out.println("Não houve excesso no peso do peixe, portanto, não há multa :)");
        }
        entrada.close();
    }
}

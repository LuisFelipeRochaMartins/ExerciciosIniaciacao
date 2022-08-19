package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        float h = entrada.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Digite seu sexo: ");
        String sexo = entrada.nextLine();
        if ("m".equalsIgnoreCase(sexo)){
            double ideal = (72.7*h)-58;
            if (ideal>peso){
                System.out.println("Você está abaixo do seu peso ideal!");

            }
            else if(ideal<peso){
                System.out.println("Você está acima do seu peso ideal!");

            }
            else{
                System.out.println("Você está no seu peso ideal");
            }
        }
        else if("f".equalsIgnoreCase(sexo)){
            double ideal = (62.1*h)-44.7;
            if (ideal>peso){
                System.out.println("Você está abaixo do seu peso ideal!");

            }
            else if(ideal<peso){
                System.out.println("Você está acima do seu peso ideal!");

            }
            else{
                System.out.println("Você está no seu peso ideal");
            }
        }
    }
}

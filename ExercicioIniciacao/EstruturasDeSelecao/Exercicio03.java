package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu sexo:");
        String sexo = entrada.nextLine();
        // Ignora se está em maiúscula ou minúscula
        if ("m".equalsIgnoreCase(sexo)){
            System.out.println("Masculino");
        }
        else if ("f".equalsIgnoreCase(sexo)){
            System.out.println("Feminino");
        }
        else{
            System.out.println("Resposta inválida");
        }
    }
}

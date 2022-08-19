package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        float prod = entrada.nextFloat();
        System.out.println("Informe o  código origem do produto: ");
        int origem = entrada.nextInt();
        System.out.println("Preço do produto: R$ " + prod);
        if (origem == 1) {
            System.out.println("Origem do produto é: Sul ");
        } else if (origem == 2) {
            System.out.println("Origem do produto é: Norte ");
        } else if (origem == 3) {
            System.out.println("Origem do produto é: Leste ");
        }
        else if(origem ==4){
            System.out.println("Origem do produto é: Oeste");
        }
        else if(origem == 5 || origem == 6 ){
            System.out.println("Origem do produto é: Nordeste ");
        }
        else if(origem == 7 || origem == 8){
            System.out.println("Origem do produto é: Centro-Oeste ");
        }
        else{
            System.out.println("Origem do produto é: Importado ");
        }
    }
}
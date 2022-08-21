package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float nota2 = entrada.nextFloat();
        if((nota1+nota2)/2>=7){
            System.out.println("Aluno aprovado com média de: "+((nota1+nota2)/2));
        }
        else{
            System.out.println("Aluno reprovado com média de: "+((nota1+nota2)/2));
        }
    }
}

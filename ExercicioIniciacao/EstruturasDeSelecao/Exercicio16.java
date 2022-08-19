package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float nota2 = entrada.nextFloat();
        if((nota1+nota2)/2>=0 && ((nota1+nota2)/2<3)){
            System.out.println("Reprovado");
        }
        else if((nota1+nota2)/2>=3 && ((nota1+nota2)/2<6.9)){
            System.out.println("Em Exame");
        }
        else if ((nota1+nota2)/2>=7 && ((nota1+nota2)/2<=10)) {
            System.out.println("Aprovado");
        }
    }
}

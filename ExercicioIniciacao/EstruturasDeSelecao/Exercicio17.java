package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float nota2 = entrada.nextFloat();
        if((nota1+nota2)/2>=0 && ((nota1+nota2)/2<4)){
            System.out.println("E pois o aluno teve notas de "+ nota1+" e "+nota2);
            System.out.println("Reprovado");
        }
        else if ((nota1+nota2)/2>=4 && ((nota1+nota2)/2<6)){
            System.out.println("D pois o aluno teve notas de "+ nota1+" e "+nota2);
            System.out.println("Reprovado");
        }
        else if ((nota1+nota2)/2>=6 && ((nota1+nota2)/2<7.5)) {
            System.out.println("C pois o aluno teve notas de " + nota1 + " e " + nota2);
            System.out.println("Aprovado");
        }
        else if ((nota1+nota2)/2>=7.5 && ((nota1+nota2)/2<9)) {
            System.out.println("B pois o aluno teve notas de " + nota1 + " e " + nota2);
            System.out.println("Aprovado");
        }
        else if ((nota1+nota2)/2>=9 && ((nota1+nota2)/2<=10)) {
            System.out.println("A pois o aluno teve notas de " + nota1 + " e " + nota2);
            System.out.println("Aprovado");
        }
    }
}

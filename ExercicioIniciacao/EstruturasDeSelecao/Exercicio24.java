package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno");
        float nota1 = entrada.nextFloat();
        System.out.println("Informe a terceira nota do aluno");
        float nota2 = entrada.nextFloat();
        System.out.println("Informe a segunda nota do aluno");
        float nota3 = entrada.nextFloat();
        if ((nota1+nota2+nota3)/3>=7 && (nota1+nota2+nota3)/3<=9.9 ){
            System.out.println("Aluno aprovado com média de: "+(nota1+nota2+nota3)/3);
        }
        else if ((nota1+nota2+nota3)/3<7){
            System.out.println("Aluno reprovado com média de: "+(nota1+nota2+nota3)/3);
        }
        else if ((nota1+nota2+nota3)/3==10){
            System.out.println("Aprovado com Distinção. Média de "+(nota1+nota2+nota3)/3);
        }
    }
}


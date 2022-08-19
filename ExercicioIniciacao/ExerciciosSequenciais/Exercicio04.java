package ExercicioIniciacao.ExerciciosSequenciais;

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a Nota número 1: ");
        float nota1 = entrada.nextFloat();
        System.out.println("informe a Nota número 2: ");
        float nota2 = entrada.nextFloat();
        System.out.println("informe a Nota número 3: ");
        float nota3 = entrada.nextFloat();
        System.out.println("informe a Nota número 4: ");
        float nota4 = entrada.nextFloat();
        entrada.close();
        System.out.println("A Media do aluno é de: "+((nota1+nota2+nota3+nota4)/4));
    }
}

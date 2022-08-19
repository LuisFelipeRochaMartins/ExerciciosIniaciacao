package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a idade do primeiro aluno: ");
        int age1 = entrada.nextInt();
        System.out.println("Informe a idade do segundo aluno: ");
        int age2 = entrada.nextInt();
        System.out.println("Informe a idade do terceiro aluno: ");
        int age3 = entrada.nextInt();
        if ((age1+age2+age3)/3<25){
            System.out.println("Turma Jovem");
        }
        else if((age1+age2+age3)/3>=25 && (age1+age2+age3)/3<=40){
            System.out.println("Turma Adulta");
        }
        else if ((age1+age2+age3)/3>40){
            System.out.println("Turma Idosa");
        }
    }
}

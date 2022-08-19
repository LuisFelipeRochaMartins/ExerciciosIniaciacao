package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu salário");
        float sal = entrada.nextFloat();
        if (sal<=280){
            System.out.println("Seu salário antes do reajuste era de: "+sal);
            System.out.println("O percentual de aumento aplicado foi de: 20%");
            System.out.println("O Valor do aumento foi de: "+((sal*1.20)-sal));
            System.out.println("Seu novo foi de: "+(sal*1.20));
        }
        else if(sal>280 && sal<700){
            System.out.println("Seu salário antes do reajuste era de: "+sal);
            System.out.println("O percentual de aumento aplicado foi de: 15%");
            System.out.println("O Valor do aumento foi de: "+((sal*1.15)-sal));
            System.out.println("Seu novo foi de: "+(sal*1.15));
        }
        else if (sal>700 && sal <1500){
            System.out.println("Seu salário antes do reajuste era de: "+sal);
            System.out.println("O percentual de aumento aplicado foi de: 10%");
            System.out.println("O Valor do aumento foi de: "+((sal*1.10)-sal));
            System.out.println("Seu novo foi de: "+(sal*1.10));
        }
        else if (sal <1500){
            System.out.println("Seu salário antes do reajuste era de: "+sal);
            System.out.println("O percentual de aumento aplicado foi de: 10%");
            System.out.println("O Valor do aumento foi de: "+((sal*1.05)-sal));
            System.out.println("Seu novo foi de: "+(sal*1.05));
        }
    }
}

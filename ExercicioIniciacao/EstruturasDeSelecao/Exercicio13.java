package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quanto voce ganha por hora: ");
        float hora = entrada.nextInt();
        System.out.println("Informe quantas horas voce trabalho por mes: ");
        int mes = entrada.nextInt();
        if (mes*hora>=900 && mes*hora<1500){
            System.out.println("(-) IR (5%'): R$ "+((hora*mes)*0.05));
            System.out.println("(-) INSS (10%): R$ "+((hora*mes)*0.1));
            System.out.println("FGTS (11% : R$ "+((hora*mes)*0.11));
            System.out.println("Total de Descontos: R$ "+(((hora*mes)*0.1)+((hora*mes)*0.05)));
            System.out.println("Salario liquido: R$ "+((((hora*mes)-(hora*mes)*0.05)-((hora*mes)*0.1))));
        }
        else if(mes*hora>= 1500 && mes*hora<2500){
            System.out.println("(-) IR (10%'): R$ "+((hora*mes)*0.10));
            System.out.println("(-) INSS (10%): R$ "+((hora*mes)*0.1));
            System.out.println("FGTS (11% : R$ "+((hora*mes)*0.11));
            System.out.println("Total de Descontos: R$ "+(((hora*mes)*0.1)+((hora*mes)*0.05)));
            System.out.println("Salario liquido: R$ "+((((hora*mes)-(hora*mes)*0.10)-((hora*mes)*0.1))));
        }
        else if(mes*hora>=2500){
            System.out.println("(-) IR (20%'): R$ "+((hora*mes)*0.20));
            System.out.println("(-) INSS (10%): R$ "+((hora*mes)*0.1));
            System.out.println("FGTS (11% : R$ "+((hora*mes)*0.11));
            System.out.println("Total de Descontos: R$ "+(((hora*mes)*0.1)+((hora*mes)*0.05)));
            System.out.println("Salario liquido: R$ "+((((hora*mes)-(hora*mes)*0.20)-((hora*mes)*0.1))));
        }
        else{
            System.out.println("(-) INSS (10%): R$ "+((hora*mes)*0.1));
            System.out.println("FGTS (11% : R$ "+((hora*mes)*0.11));
            System.out.println("Total de Descontos: R$ "+(((hora*mes)*0.1)+((hora*mes)*0.05)));
            System.out.println("Salario liquido: R$ "+((((hora*mes)-(hora*mes)*0.20)-((hora*mes)*0.1))));
        }
    }
}
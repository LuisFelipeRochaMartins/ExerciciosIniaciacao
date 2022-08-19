import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Informe a número de metros que deseja converter:");
        Scanner entrada = new Scanner(System.in);
        float metros = entrada.nextFloat();
        System.out.println("A Conversão resultou em:"+ (metros*100));
        entrada.close();
    }
}

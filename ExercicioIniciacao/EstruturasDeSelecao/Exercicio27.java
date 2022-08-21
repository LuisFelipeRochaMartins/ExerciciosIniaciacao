package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio27 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe quantos litros voce quer abastecer: ");
            int l = entrada.nextInt();
            String comb = entrada.nextLine();
            System.out.println("Qual tipo de combustivel?"
                    +"\nA - para Alcool"
                    +"\nG - para Gasolina");
            comb = entrada.nextLine();
            if (l<=20){
                if("a".equalsIgnoreCase(comb)){
                    System.out.println("Voce pagara: R$"+((l*1.9)*0.97));
                }
                if("g".equalsIgnoreCase(comb))
                    System.out.println("Voce pagara: R$"+((l*2.5)*0.96));
            }
            if(l>20){
                if("a".equalsIgnoreCase(comb)){
                    System.out.println("Voce pagara: R$"+((l*1.9)*0.95));
                }
                if("g".equalsIgnoreCase(comb))
                    System.out.println("Voce pagara: R$"+((l*2.5)*0.94));
            }
        }
    }

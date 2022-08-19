package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Telefonou para a Vítima? [S/N]");
        String p1 = entrada.next();
        System.out.println("Esteve no local do crime? [S/N]");
        String p2 = entrada.next();
        System.out.println("Mora perto da vítima? [S/N]");
        String p3 = entrada.next();
        System.out.println("Devia para a vítima? [S/N]");
        String p4 = entrada.next();
        System.out.println("Já trabalhou com a vítima? [S/N]");
        String p5 = entrada.next();
        int cont = 1;
        if ("S".equalsIgnoreCase(p1)){
        //    int cont = cont+1;
        }
        if ("S".equalsIgnoreCase(p2)){
         //   int cont = cont+1;
        }
        if ("S".equalsIgnoreCase(p3)){
         //   int cont = cont+1;
        }
        if ("S".equalsIgnoreCase(p4)){
           // int cont = cont+1;
        }
        if ("S".equalsIgnoreCase(p5)){
          //  int cont = cont+1;
        }
        if (cont==2){
            System.out.println("Suspeita");
        }else if (cont==3 || cont==4){
            System.out.println("Cumplice");
        }else if (cont==5){
            System.out.println("Assassino!");
        }
    }
}

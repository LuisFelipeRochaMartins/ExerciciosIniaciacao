package ExercicioIniciacao.EstruturasDeSelecao;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe uma data:");
        System.out.println("Dia: (dd)");
        int d = entrada.nextInt();
        System.out.println("Mês");
        int m = entrada.nextInt();
        System.out.println("Ano: ");
        int ano = entrada.nextInt();
        if ((ano&4)==0 && (ano%100!=0) || (((ano%400==0)))) {
            boolean Bissexto = true;
        }
        else{
            boolean Bissexto = false;
        }
      //  if (Bissexto == true){
           // if(m>=1 || m<=12){
               // if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
                 //   if ((d>=1) || (d<=31)){
                  //      System.out.println("Ano bissexto");
                   //     System.out.println("Data Válida"+d+"/"+m+"/"+ano);
                  //  }
               // }
               // else if(m==4 || m==6 || m==9 || m==11){
                //    if ((d>=1) || (d<=30)){
                //        System.out.println("Ano bissexto");
                 //       System.out.println("Data Válida"+d+"/"+m+"/"+ano);
               //     }
             //   }
             //   else if (m==2){
//
       //         }
        //    }
          //  else{
          //      System.out.println("Mês inválido");
          //  }

       // }
       // else{
         //   if(m>=1 || m<=12){
           //     if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
             //       if ((d>=1) || (d<=31)){
               //         System.out.println("Data Válida"+d+"/"+m+"/"+ano);
                 //   }
               // }
           // }
            //else{
             //   System.out.println("Mês inválido");
            //}

      // }
    }
}

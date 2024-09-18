import java.util.Scanner;

public class exc21 {
    public exc21() {

        /*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3
         centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários
          para que Zé seja maior que Chico.
         */

         float alturaChico = 1.50f;
         float alturaZe = 1.10f;
         int anos = 0;
 
         while (alturaChico > alturaZe) {
             alturaChico += 0.02;
             alturaZe += 0.03;
             anos ++;
         }
 
         System.out.println();
         System.out.println("Serão necessários " + anos + " anos para que Zé fique maior que Chico");
         System.out.println();
         
     }

    public static void main(String[] args) {
        new exc21();
    }
}

import java.util.Scanner;

public class exc12 {
    public exc12() {

        /*Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
         * 
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * 16 17 18 19 20 21
         */

         Scanner s = new Scanner(System.in);
         System.out.println("Digite o número de linhas");
         int linha = s.nextInt();
 
         int cont = 1;
         for (int i = 1; i <= linha; i++){
             for (int j = 1; j <= i; j++) {
                 System.out.print(cont + " ");
                 cont++;
             }
             System.out.println();
         }
 
         s.close();
        }

    public static void main(String[] args) {
        new exc12();
    }
}

import java.util.Scanner;

public class exc32 {
    public exc32() {

        /*
         * Escreva um programa que imprime um calendário para um determinado mês. O
         * calendário deve conter cada dia do mês e o dia da semana correspondente. A
         * entrada consiste de um inteiro especificando em que dia da semana cai o
         * primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro
         * especificando o número de dias que o mês possui.
         * 
         * Exemplo: p = 3 n = 31
         * 
         * D S T Q Q S S
         *     1 2 3 4 5
         * 6 7 8 9 10 11 12
         * 13 14 15 16 17 18 19
         * 20 21 22 23 24 25 26
         * 27 28 29 30 31
         * 
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Em qual dia da semana começa o mês?(considere domingo = 1 e sábado = 7)");
         int dia = sc.nextInt();
         System.out.println("Quantos dias tem o mês?");
         int dias = sc.nextInt();
         System.out.println("D S T Q Q S S");
         System.out.println("--------------");
 
         int i = 1;
         while(i < dia){
             System.out.print("  ");
             i++;
         }
         i = 1;
         while(i <= dias){
             if (i < 10) {
                 System.out.print(" " + i);
               } else {
                 System.out.print(" " + i);
               }
               if (dia == 7) {
                 dia = 1;
                 System.out.print("\n");
               } else {
                 dia++;
             }
             i++;
         }
     
 
           sc.close();
 
     }

    public static void main(String[] args) {
        new exc32();
    }
}
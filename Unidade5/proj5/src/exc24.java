import java.util.Scanner;

public class exc24 {
    public exc24() {

        /*Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca 
        de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) e então 
        leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto.
         Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. 
         Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar 
         a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.
         * 
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite o peso limite diário (em Kg):");
         float pesoLimite = sc.nextFloat();
 
         System.out.println("Digite o peso do peixe (em g):");
         float pesoPeixe = sc.nextFloat();
 
         System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
         char opcao = sc.next().toUpperCase().charAt(0);
 
         float pesoTotal = pesoPeixe / 1000;
 
         while (pesoTotal < pesoLimite && opcao == 'S') {
             System.out.println("Digite o peso do peixe (em g):");
             pesoPeixe = sc.nextFloat();
             pesoTotal += pesoPeixe / 1000;
             System.out.println("Peso total obtido até o momento: " + pesoTotal + "Kg");
             System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
             opcao = sc.next().toUpperCase().charAt(0);
         }
 
         System.out.println("peso obtido: " + pesoTotal + "Kg");
         if (pesoTotal > pesoLimite) {
         System.out.println("Limite excedido");
         }
 
         sc.close();
     }
 
    public static void main(String[] args) {
        new exc24();
    }
}

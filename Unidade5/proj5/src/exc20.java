import java.util.Scanner;

public class exc20 {
    public exc20() {

        /*Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
         Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário 
         para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite a massa inicial do material (em Kg): ");
         float massaInicial = sc.nextFloat();
 
         float massaFinal = massaInicial;
         float tempo = 0;
 
         while (massaFinal > 0.005f) {
             massaFinal = massaFinal / 2;
             tempo += 50;
         }
 
         massaFinal = massaFinal * 1000;
         System.out.println("Massa inicial: " + massaInicial + "Kg" + "\n" + "Massa final: " + massaFinal + "g" + "\n" + "Tempo necessário: " + tempo + "s");
 
         sc.close();
     }

    public static void main(String[] args) {
        new exc20();
    }
}

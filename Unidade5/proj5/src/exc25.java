import java.util.Scanner;

public class exc25 {
    public exc25() {

        /*Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, 
        ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada
         e determine o vencedor. A partida encerra quando:

         um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
         o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira
          condição não seja atendida.
         * 
         */

         int D = 0, E = 0, maior;
         char ponto;
 
         Scanner v = new Scanner(System.in);
         while (!((D >= 21 || E >= 21) && (D - E >= 2 || E - D >= 2))) {
             System.out.println("Direito // Esquerdo");
             System.out.println(D + "      //      " + E);
             System.out.println("Quem marcou ponto? d(Direito)/e(Esquerdo)");
             ponto = v.next().toLowerCase().charAt(0);
 
             if (ponto == 'd')
                 D++;
             else
                 E++;
 
             if (D > E)
                 maior = D;
             else
                 maior = E;
 
             if ((D >= 21 || E >= 21) && (D - E >= 2 || E - D >= 2)) {
                 if (maior == D)
                     System.out.println("O vencedor é o lado direito, com " + maior + " pontos.");
                 else
                     System.out.println("O vencedor é o lado esquerdo, com " + maior + " pontos.");
             }
         }
         v.close();
        
}
    public static void main(String[] args) {
        new exc25();
    }
}

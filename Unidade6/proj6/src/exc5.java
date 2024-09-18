import java.util.Scanner;

public class exc5 {
    public exc5() {

        /*
         * Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça
         * cada um respondeu um questionário com 5 perguntas, como por exemplo:
         * 
         * Gosta de música sertaneja?
         * Gosta de futebol?
         * Gosta de seriados?
         * Gosta de redes sociais?
         * Gosta da Oktoberfest?
         * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice
         * de afinidade é medido da seguinte maneira:
         * 
         * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
         * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
         * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
         * Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as
         * respostas da moça. Crie um método que possa ler tanto as respostas do rapaz
         * como da moça, e outro para calcular e retornar a afinidade. Por fim, escreva
         * a afinidade considerando os seguintes intervalos:
         * 
         * Afinidade Mensagem
         * 15 “Casem!
         * 10 a 14 “Vocês têm muita coisa em comum!”
         * 5 a 9 “Talvez não dê certo :(”
         * 0 a 4 “Vale um encontro.”
         * -1 a -9 “Melhor não perder tempo”
         * -10 “Vocês se odeiam!”
         */

         String perguntas[] = new String[5];
         // String pergunta[] = {"Gosta de música sertaneja?",
         // "Gosta de futebol?", "Gosta de seriados?"};
         // perguntas[0] = "...";
         // perguntas[1] = "....";
        
        
 
         Scanner s = new Scanner(System.in);
         lerPerguntas(s, perguntas);
 
         /*for (int i = 0; i < perguntas.length; i++) {
             System.out.print("Qual pergunta? ");
             perguntas[i] = s.nextLine();
         }*/
         //char respostaMoca[] = new char[5];
        // char respostaRapaz[] = new char[5];
         /*System.out.println("Inicio das respostas do rapaz:");
         for (int i = 0; i < perguntas.length; i++) {
             System.out.print(perguntas[i] + 
                 " (Sim, Nao ou Ind): ");
             respostaRapaz[i] = s.nextLine().trim().toUpperCase().charAt(0);
 
         }*/
         char respostaRapaz[] = popularRespostas(s, 
                 perguntas, "rapaz");  
         char respostaMoca[] = popularRespostas(s, 
                     perguntas, "moca");
 
         /*System.out.println("Inicio das respostas da moça:");
         for (int i = 0; i < perguntas.length; i++) {
             System.out.print(perguntas[i] + 
                 " (Sim, Nao ou Ind): ");
             respostaMoca[i] = s.nextLine().trim().toUpperCase().charAt(0);
 
         }*/
         /*int indice = 0;
         for (int i = 0; i < respostaMoca.length; i++) {
             if (respostaMoca[i] == respostaRapaz[i]) {
                 indice += 3;
             } else if ((respostaMoca[i] == 'S' &&
                         respostaRapaz[i] == 'N') ||
                         (respostaMoca[i] == 'N') &&
                         respostaRapaz[i] == 'S') {
                             indice -= 2;
             } else {
                 indice += 1;
             }
         }*/
 
         int indice = calcularIndice(respostaRapaz, respostaMoca);
         if (indice == 15) {
             System.out.println("Casem ");
         } else if (indice >= 10 && indice <= 14) {
             System.out.println("Vocês têm muita coisa em comum!");
         } else if (indice >= 5 && indice <= 9) {
             System.out.println("Vale um encontro.");
         } else if (indice >= 0 && indice <= 4) {
             System.out.println("Talvez não dê certo :(");
         } else if (indice >= -9 && indice <= -1) {
             System.out.println("Melhor não perder tempo");
         } else {
             System.out.println("Vocês se odeiam!");
         }
             
         
 
         s.close();
     }
 
 
     public void lerPerguntas(Scanner scanner, String[] vetor) {
         for (int i = 0; i < vetor.length; i++) {
             System.out.print("Qual pergunta? ");
             vetor[i] = scanner.nextLine();
         }
     }
     public int calcularIndice(char[] v1, char[] v2) {
         int indice = 0;
         for (int i = 0; i < v1.length; i++) {
             if (v1[i] == v2[i]) {
                 indice += 3;
             } else if ((v1[i] == 'S' &&
                         v2[i] == 'N') ||
                         (v1[i] == 'N') &&
                         v2[i] == 'S') {
                             indice -= 2;
             } else {
                 indice += 1;
             }
         }
         return indice;
     }
     public char[] popularRespostas(Scanner s, 
             String[] perguntas, String nome) {
         char[] respostas = new char[5];
         System.out.println("Inicio das respostas " +
          "do(a) " + nome);
         for (int i = 0; i < perguntas.length; i++) {
             System.out.print(perguntas[i] + 
                 " (Sim, Nao ou Ind): ");
             respostas[i] = s.nextLine().trim().toUpperCase().charAt(0);
         }
         return respostas;
     }

    public static void main(String[] args) {
     new exc5();
    }
}

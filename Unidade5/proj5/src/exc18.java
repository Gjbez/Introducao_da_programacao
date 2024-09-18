import java.util.Scanner;

public class exc18 {
    public exc18() {

        /*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado
         bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor
          de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12)
           e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em 
           cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi 
           registrado zero para o número do canal e para o número de pessoas.
            Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora,
             o percentual de audiência. A leitura deve ser finalizada quando for informado canal 0.
         * 
         */

         Scanner sc = new Scanner(System.in);

         int pessoas = 0;
         int canal = 0;
         int canal4 = 0;
         int canal5 = 0;
         int canal9 = 0;
         int canal12 = 0;
         int pessoasAssistindo = 0;
 
         System.out.println("A TV está ligada?(S pra sim e N pra não)");
         char TV = sc.next().toUpperCase().charAt(0);
         if (TV == 'S') {
             System.out.println("Quantas pessoas estão assistindo?");
             pessoasAssistindo = sc.nextInt();
             pessoas += pessoasAssistindo;
             System.out.println("Digite o canal (4, 5, 9 ou 12)");
             canal = sc.nextInt();
         } else if (TV == 'N') {
             canal = 0;
         }
 
         while (canal != 0) {
             if (canal == 4) {
                 canal4 += pessoasAssistindo;
             } else if (canal == 5) {
                 canal5 += pessoasAssistindo;
             } else if (canal == 9) {
                 canal9 += pessoasAssistindo;
             } else if (canal == 12) {
                 canal12 += pessoasAssistindo;
             }
             System.out.println("A TV está ligada?");
             TV = sc.next().toUpperCase().charAt(0);
             if (TV == 'S') {
                 System.out.println("Quantas pessoas estão assistindo?");
                 pessoasAssistindo = sc.nextInt();
                 pessoas += pessoasAssistindo;
                 System.out.println("Digite o canal (4, 5, 9 ou 12)");
                 canal = sc.nextInt();
         } else if (TV == 'N') {
             canal = 0;
         }
     }
 
 
     float percentualCanal4 = (canal4 * 100) / pessoas;
     float percentualCanal5 = (canal5 * 100) / pessoas;
     float percentualCanal9 = (canal9 * 100) / pessoas;
     float percentualCanal12 = (canal12 * 100) / pessoas;
 
     System.out.println("O percentual de audiência da canal 4 é de " + percentualCanal4);
     System.out.println("O percentual de audiência da canal 5 é de " + percentualCanal5);
     System.out.println("O percentual de audiência da canal 9 é de " + percentualCanal9);
     System.out.println("O percentual de audiência da canal 12 é de " + percentualCanal12);
 
 
         sc.close();
     
      }
    public static void main(String[] args) {
        new exc18();
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class exc28 {
    public exc28() {

        /*
         * Uma emissora de rádio decidiu promover uma eleição para determinar o melhor
         * conjunto do ano segundo a opinião dos ouvintes. Entraram na disputa apenas os
         * quatro conjuntos mais solicitados durante o ano. Os votos são informados
         * através de códigos:
         * 
         * código conjunto
         * 1 Nenhum de Nós
         * 2 CPM22
         * 3 Skank
         * 4 Jota Quest
         * Descreva um algoritmo que:
         * 
         * informe o total de votos para cada grupo;
         * informe o percentual dos votos para cada grupo;
         * informe o grupo vencedor.
         * 
         * O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s
         * (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("As opções de voto são: \n1: Nenhum de Nós \n2: CPM22 \n3: Skank \n4: Jota Quest");
 
         int nenhumDeNos = 0;
         int CPM22 = 0;
         int skank = 0;
         int jotaQuest = 0;
                         
         System.out.println("Digite o código do conjunto em que deseja votar:");
         int codigo = sc.nextInt();
 
         int totalVotos = 0;
 
         System.out.println("mais um voto: s (SIM) / n (NÃO)?");
         char opcao = sc.next().toUpperCase().charAt(0);
 
         while (opcao == 'S') {
             if (codigo == 1) {
                 nenhumDeNos += 1;
             } else if (codigo == 2) {
                 CPM22 += 1;
             } else if (codigo == 3) {
                 skank += 1;
             } else if (codigo == 4) {
                 jotaQuest += 1;
             }
         
             System.out.println("Digite o código do conjunto em que deseja votar:");
             codigo = sc.nextInt();
             
             System.out.println("mais um voto: s (SIM) / n (NÃO)?");
             opcao = sc.next().toUpperCase().charAt(0);
 
 
             totalVotos++;
         }
 
         if (codigo == 1) {
             nenhumDeNos += 1;
         } else if (codigo == 2) {
             CPM22 += 1;
         } else if (codigo == 3) {
             skank += 1;
         } else if (codigo == 4) {
             jotaQuest += 1;
         }
         totalVotos++;
 
         float percentualNenhumDeNos = (nenhumDeNos * 100) / totalVotos;
         float percentualCPM22 = (CPM22 * 100) / totalVotos;
         float percentualSkank = (skank * 100) / totalVotos;
         float percentualJotaQuest = (jotaQuest * 100) / totalVotos;
 
         System.out.println("A quantidade de votos do grupo Nenhum de Nós foi de " + nenhumDeNos + " e com uma porcentagem de " + percentualNenhumDeNos + "%");
         System.out.println("A quantidade de votos do grupo CPM22 foi de " + CPM22 + " e com uma porcentagem de " + percentualCPM22 + "%");
         System.out.println("A quantidade de votos do grupo Skank foi de " + skank + " e com uma porcentagem de " + percentualSkank + "%");
         System.out.println("A quantidade de votos do grupo Jota Quest foi de " + jotaQuest + " e com uma porcentagem de " + percentualJotaQuest + "%");
 
         if (nenhumDeNos > CPM22 && nenhumDeNos > skank && nenhumDeNos > jotaQuest) {
             System.out.println("\nNenhum de Nós foi o grupo vencedor");
         } else if (CPM22 > skank && CPM22 > jotaQuest) {
             System.out.println("\nCPM22 foi o grupo vencedor");
         } else if (skank > jotaQuest) {
             System.out.println("\nSkank foi o grupo vencedor");
         } else {
             System.out.println("\nJota Quest foi o grupo vencedor");
         }
 
 
         sc.close();
     }
    

    public static void main(String[] args) {
        new exc28();
    }
}

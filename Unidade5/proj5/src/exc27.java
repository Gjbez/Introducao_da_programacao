import java.util.Scanner;

public class exc27 {
    public exc27() {

        /*
         * Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor
         * diário conforme as regras descritas abaixo. Escreva um programa para ler o
         * dia do mês de abril que será calculado o valor diário. O programa deve
         * validar a leitura do dia deforma a aceitar apenas valores válidos para o mês
         * de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem
         * "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser
         * lido o total de peças produzidas pelo funcionário no turno da manhã e o total
         * de peças produzidas no turno da tarde. Escrever o valor que o respectivo
         * funcionário receberá no dia. Logo após exibir a mensagem
         * "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser
         * repetido solicitando novamente o dia do mês e a produção de peças do
         * funcionário em cada turno, caso contrário deve ser encerrado.
         * 
         * Regras:
         * 
         * para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por
         * peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde),
         * desde que a produção em cada um dos turnos não seja inferior a 30. Caso
         * contrário recebe R$ 0,50 por peça.
         * para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por
         * peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da
         * tarde.
         * Considere que a produção em cada turno nunca será a mesma (não é necessário
         * validar) Responda também:
         * 
         * qual dia ocorreu a maior produção;
         * em qual período o funcionário mais produz (manhã ou tarde e a quantidade
         * produzida).
         * Exemplo de entrada / saída:
         * 
         * Dia Manhã Tarde Saída
         * -1 Dia inválido
         * 32 Dia inválido
         * 10 50 60 R$ 88,00 (valor recebido)
         * Novo funcionário: (1.sim 2.não)?
         * 1 (sim)
         * 14 110 20 R$ 65,00 (valor recebido)
         * Novo funcionário: (1.sim 2.não)?
         * 1 (sim)
         * 12 20 90 R$ 55,00 (valor recebido)
         * Novo funcionário: (1.sim 2.não)?
         * 1 (sim)
         * 16 40 90 R$ 43,00 (valor recebido)
         * Novo funcionário: (1.sim 2.não)?
         * 1 (sim)
         * 13 20 22 R$ 21,00 (valor recebido)
         * Novo funcionário: (1.sim 2.não)?
         * 1 (sim)
         * 9 40 42 R$ 41,00 (valor recebido)
         * Novo funcionário: (1.sim 2.não)?
         * 2 (não)
         */

         Scanner x = new Scanner(System.in);
         int op = 1, dia, manha, tarde, diaMaiorProducao = 0, maiorProducao = 0;
         double valorPM, valorPT;
         String maiorProducaoString;
 
         while (op == 1) {
             System.out.print("Informe o dia: ");
             dia = x.nextInt();
 
             if (dia < 31 && dia > 0) {
                 System.out.println("Quantas pecas foram produzidas de manhã?");
                 manha = x.nextInt();
                 System.out.println("Quantas pecas foram produzidas de tarde?");
                 tarde = x.nextInt();
 
                 if (manha + tarde > maiorProducao) {
                     maiorProducao = manha + tarde;
                     diaMaiorProducao = dia;
                 }
 
                 if (manha < tarde)
                     maiorProducaoString = "Tarde";
                 else
                     maiorProducaoString = "Manha";
 
                 if (dia <= 15) {
                     if (manha + tarde > 100 && manha >= 30 && tarde >= 30) {
                         valorPM = 0.80;
                         valorPT = 0.80;
                     } else {
                         valorPM = 0.50;
                         valorPT = 0.50;
                     }
                 }
 
                 else {
                     valorPM = 0.40;
                     valorPT = 0.30;
                 }
 
                 System.out.println("Valor recebido foi de R$ " + ((valorPM * manha) + (valorPT * tarde)));
                 System.out.println("E sua produção foi maior no periodo de " + maiorProducaoString);
                 System.out.println("Novo funcionário: (1.sim 2.não)?");
                 op = x.nextInt();
 
                 if (op == 2)
                     System.out.println("O dia de maior producao foi dia " + diaMaiorProducao);
             } else
                 System.out.println("Dia inválido!");
         }
         x.close();

}
    public static void main(String[] args) {
        new exc27();
    }
}

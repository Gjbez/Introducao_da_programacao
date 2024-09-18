import java.text.DecimalFormat;
import java.util.Scanner;

public class exc34 {
    public exc34() {

        /*
         * Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A
         * taxa de serviços é de:
         * 
         * R$ 7,50 por diária, caso o número de diárias seja menor que 15;
         * R$ 6,50 por diária, caso o número de diárias seja igual a 15;
         * R$ 5,00 por diária, caso o número de diárias seja maior que 15.
         * Descreva um algoritmo que apresente as seguintes opções ao recepcionista:
         * 
         * (1) encerrar a conta de um hóspede;
         * (2) verificar número de contas encerradas;
         * (3) sair.
         * Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do
         * hóspede e escreva o nome e total a ser pago. Caso a opção escolhida seja a
         * segunda, informe o número de hóspedes que deixaram o hotel (número de contas
         * encerradas). Caso a opção escolhida seja a terceira finalize a execução do
         * algoritmo.
         */

         Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");
 
         float precoDiaria = 50;
         float valorMais15Dias = 5;
         float valor15Dias = 6.50f;
         float valorMenos15Dias = 7.50f;
 
         float totalPago = 0;
 
         int hospedes = 0;
 
         int opcao = 0;
         do {
             System.out.println("Escolha uma opção: \r\n" +
             "(1) encerrar a conta de um hóspede;\r\n" + 
             "(2) verificar número de contas encerradas;\n" + 
             "(3) sair.");
             opcao = sc.nextInt();
 
             switch (opcao) {
                 case 1:
                 System.out.println("Digite o nome do hóspede");
                 String nome = sc.next();
                 System.out.println("Digite o número de diárias: ");
                 int diarias = sc.nextInt();
                 if(diarias > 15){
                     totalPago = precoDiaria + (diarias * valorMais15Dias);
                     }	
                     else if(diarias == 15){
                     totalPago = precoDiaria + (diarias * valor15Dias);
                     }
                     else{
                     totalPago = precoDiaria + (diarias * valorMenos15Dias);
                     }
                 System.out.println("O total a ser pago por " + nome + " é de R$ " + df.format(totalPago));
                 hospedes ++;
                     break;
                 case 2:
                 System.out.println(hospedes + " hóspedes deixaram o hotel");
                 break;
             }
         } while (opcao != 3);
 
         
         sc.close();
     }
 
    public static void main(String[] args) {
        new exc34();
    }
}

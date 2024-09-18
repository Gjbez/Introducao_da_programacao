import java.text.DecimalFormat;
import java.util.Scanner;

public class ex18 {
    public ex18(){
        
        /*Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, 
        o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após
         o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada
          dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor
           a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os
            clientes nunca deixam para pagar no mês seguinte. */

        Scanner o = new Scanner(System.in);

        System.out.println("valor do pagamento");
        double vp = o.nextDouble();
        System.out.println("dia de vencimento");
        int dv = o.nextInt();
       System.out.println("dia do pagamento");
        int dp = o.nextInt();
    
       DecimalFormat i = new DecimalFormat("0.00");

       if ( dp <= dv ) {

        double dc = vp - (vp*0.10);
        
        System.out.println("valor fica R$" + i.format(vp) + " pagamento está em dia");

       } else if ( dv <= dp+5) {

        System.out.println("paga sem desconto");

       }else if (dp > dv) {
          
        double prest = ((dp-dv+5)*0.02)*vp;

        System.out.println("pagamento com multa de R$" + i.format(prest));

       }
       
       o.close();
    }
    public static void main(String[] args) {
        new ex18();
    }
}

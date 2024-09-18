import java.text.DecimalFormat;
import java.util.Scanner;

public class ex15 {
    public ex15(){
        
        /*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. A empresa irá conceder 5% de 
        reajuste para o funcionário que for admitido há até de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7%
         de reajuste.O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido */

        Scanner o = new Scanner(System.in);

        System.out.println( "Digite salário");
         double s = o.nextDouble();
       System.out.println("digite quantos meses está adimitido: ");
          int mesfunc = o.nextInt();
    
          DecimalFormat i = new DecimalFormat("0.00");

       if ( mesfunc == 12) { 
          
        double a = s * 0.05;
        double b = s + a; 

        System.out.println("receberá 5% de reajuste no salário: R$" + i.format(b));

      } else if (mesfunc > 12 && mesfunc < 49) {

        double c = s * 0.07;
        double d = s + c;

        System.out.println("receberá 7% de reajuste no salário: R$" + i.format(d));

       } else {


        System.out.println("erro");
       }
       
       o.close();
    }
    public static void main(String[] args) {
        new ex15();
    }
}

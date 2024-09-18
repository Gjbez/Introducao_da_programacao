import java.text.DecimalFormat;
import java.util.Scanner;

public class ex17 {
    public ex17(){
        
        /*Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o número de dependentes do 
        contribuinte. A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte. 
        O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. Para aqueles que possuem renda líquida 
        entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; para rendas líquidas de R$ 5.000,00 
        até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 pagam 15% de imposto. */

        Scanner o = new Scanner(System.in);

       System.out.println("digite renda anual: R$");
        int ra = o.nextInt();
       System.out.println("digite número de dependentes: ");
        int dp = o.nextInt();

       DecimalFormat i = new DecimalFormat("0.00");

       if ( ra < 2000.01 ) {
        System.out.println("não paga imposto");
        
       } else if ( ra > 2000 && ra < 5000.01) {
        float ral = ra - ra * (dp * 2/100); 
        float imp = ral * 5/100f;

        System.out.println("paga 5% de imposto: R$" + i.format(imp));
       } else if ( ra > 5000 && ra < 1000.01) {
        float ral = ra - ra * (dp * 2/100); 
        float imp = ral * 10/100f;

        System.out.println("paga 10% de imposto: R$" + i.format(imp));
       } else if ( ra > 1000);
       float ral = ra - ra * (dp * 2/100); 
       float imp = ral * 15/100f;
        

        System.out.println("paga 15% de imposto: R$" + i.format(imp));
       o.close();
    }
    public static void main(String[] args) {
        new ex17();
    }
}

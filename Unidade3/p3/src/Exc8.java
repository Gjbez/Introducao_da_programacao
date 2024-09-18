import java.util.Scanner;

public class Exc8 {
    public Exc8(){

        /*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente.
          Considerando que o atendente tem a cotação do dólar, 
          descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
         * 
         * 
         * Analise:ok
         * Entrada:valor em dolar
         * Saida:valor
         * Processo
         * ler dlr 
         * double reais = 4.40*dlr
         * escrever valor em reais a ser devolvido
         * Teste1:
         * dlr=2
         * reais=4,40*2
         * valor=8,80
         */
     
         Scanner dlr = new Scanner(System.in);

         System.out.println("Digite valor em dólar: ");
         double dolar = dlr.nextDouble();
        
        double reais = 4.40 * dolar;
         

         System.out.println("Valor em reais: " + reais);

         dlr.close();
    }
    public static void main(String[] args) {
        new Exc8();
    }
}

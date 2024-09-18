import java.text.DecimalFormat;
import java.util.Scanner;

public class exc23 {
    public exc23() {

        /*Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas
         durante o mês, que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor,
          em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a 
          quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de 
          vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado.
           Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem:
            “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. 
            O número de produtos (n) de cada vendedor deve ser informado.
         */ 

         Scanner sc = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");
 
         System.out.println("Digite o nome do vendedor:");
         String nome = sc.next();
         System.out.println("Digite a quantidade de produtos vendidos pelo vendedor no mês:");
         int produtos = sc.nextInt();
 
         float comissao = 0;
         float totalVendas = 0;
 
         int contador = 0;
         while (contador < produtos) {
             System.out.println("Digite o preço do produto:");
             float precoProduto = sc.nextFloat();
             comissao += precoProduto * 0.3f;
             totalVendas += precoProduto;
             contador++;
         }
 
         System.out.println(nome + " teve um total de vendas de R$ " + df.format(totalVendas) + " e um salário de R$ " + df.format(comissao));
 
 
         sc.close();
    }

    public static void main(String[] args) {
        new exc23();
    }
}

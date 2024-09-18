import java.text.DecimalFormat;
import java.util.Scanner;

public class exc19{
    public exc19() {

        /*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo
         com o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que 
         R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra
          e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao
           final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.
         * 
         */


          Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o valor da compra:");
        float valorCompra = sc.nextFloat();

        float valorDesconto = 0;
        float valorFinal = 0;
        float totalRecebido = 0;

        while (valorCompra != 0) {
            if (valorCompra > 500) {
                valorDesconto = valorCompra * 0.2f;
                valorFinal = valorCompra - valorDesconto;
                System.out.println("Total a pagar: R$ " + df.format(valorFinal));
            }
            if (valorCompra <= 500) {
                valorDesconto = valorCompra * 0.15f;
                valorFinal = valorCompra - valorDesconto;
                System.out.println("Total a pagar: R$ " + df.format(valorFinal));
            }
            totalRecebido += valorFinal;
            System.out.println("Digite o valor da compra:");
            valorCompra = sc.nextFloat();
        }

        System.out.println("Total recebido pela loja: R$ " + df.format(totalRecebido));


        sc.close();
    }

   
    public static void main(String[] args) {
        new exc19();
    }
}

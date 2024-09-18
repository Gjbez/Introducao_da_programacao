import java.util.Scanner;

public class exc29 {
    public exc29() {

        /*Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor
         e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor 
         solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. 
         Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.
         */ 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        int valorCompra = sc.nextInt();

        while (valorCompra != 0) {
        int cedula20 =  valorCompra / 20;
        valorCompra = valorCompra % 20;
        int cedula10 = valorCompra / 10;
        valorCompra = valorCompra % 10;
        int cedula5 = valorCompra / 5;
        valorCompra = valorCompra % 5;
        int cedula2 = valorCompra / 2;
        valorCompra = valorCompra % 2;
        int cedula1 = valorCompra;

        System.out.println(cedula20 + " cédula(s) de R$ 20,00");
        System.out.println(cedula10 + " cédula(s) de R$ 10,00");
        System.out.println(cedula5 + " cédula(s) de R$ 5,00");
        System.out.println(cedula2 + " cédula(s) de R$ 2,00");
        System.out.println(cedula1 + " cédula(s) de R$ 1,00");

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextInt();
        }

        sc.close();
    }
    public static void main(String[] args) {
        new exc29();
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc12 {
    
    public Exc12(){

        /*
         * Uma empresa tem para um funcionário os seguintes dados:
         * o nome, o número de horas trabalhadas mensais e o número de dependentes. 
         * A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho)
         * e R$ 60,00 por dependente (valor para cálculo do salário família) e 
         * são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda.
         * Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.

         * Analise:ok
         * Entrada:nome,numero de horas,numero de dependentes
         * Saida:salario liquido
         * Processo
         * ler nome
         * ler nh
         * ler nd
         * double sl = 10
         * double sd = 60
         * double desc = sl-(8.5/100)
         * double inss = sl-(5/100)
         * valor = nd*sl + nd*dep - desc+inss
         * escrever salario
         * Teste1:
         */

         Scanner emp = new Scanner(System.in);

         System.out.println("Nome do funcionário ");
         String nome = emp.next();
         System.out.println("Número de horas trabalhadas mensais ");
         int nh = emp.nextInt();
         System.out.println("Número de dependentes ");
         int nd = emp.nextInt();

        double sl = 10.00;

        double dep = 60.00;
        double desc = sl - (8.5/100);
        double inss = sl - (5/100);
        double slt = (nh*sl) + (nd*dep);
        double valor = (nh*sl) + (nd*dep) - (desc+inss);

        DecimalFormat o = new DecimalFormat("0.00");
        
        System.out.println("funcionário " + nome + " possui salário liquido de R$" + o.format(slt) + " e salário bruto de R$" + o.format(valor));

        
         emp.close();
    }
    public static void main(String[] args) {
        new Exc12();
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex21 {
    public ex21(){ 
        
        /*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal.
         O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas 
         e a altura está em metros, de acordo com a fórmula: IMC=Massa/Altura^2

Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

IMC	   Classificação
< 18.5	Magreza
18.5 - 24.9	Saudável
25.0 - 29.9	Sobrepeso
30.0 - 34.9	Obesidade Grau I
35.0 - 39.9	Obesidade Grau II (severa)
>= 40.0	Obesidade Grau III (mórbida)*/

        Scanner o = new Scanner(System.in);
      System.out.println("Digite valores para calcular o Imc: ");
      System.out.println("Digite massa: ");
        double m = o.nextDouble();
        System.out.println("Digite altura: ");
        double h = o.nextDouble();
        double imc = m/(h*h); 
        
        DecimalFormat i = new DecimalFormat("0.0");
       System.out.println("IMC = " + i.format(imc));


       if (imc < 18.5) {

        System.out.println("Magreza");

       } else if (imc > 18.5 && imc < 25.0) {

        System.out.println("Saudável");
        
       } else if (imc > 25.0 && imc < 30.0 ) {

        System.out.println("Sobrepeso");
        
       }  else if (imc > 30.0 && imc < 35.0 ) {

        System.out.println("Obesidade Grau I");
        
       }  else if (imc > 35.0 && imc < 40.0 ) {

        System.out.println("Obesidade Grau II (severa)");
        
       }  else if (imc >= 39.9) {

        System.out.println("Obesidade Grau III (mórbida)");
        
       } 
       o.close();
    }
    public static void main(String[] args) {
        new ex21();
    }
}



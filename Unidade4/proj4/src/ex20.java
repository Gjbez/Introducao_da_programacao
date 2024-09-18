import java.text.DecimalFormat;
import java.util.Scanner;

public class ex20 {
    public ex20(){ 
        
        /*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,descreva um algoritmo que calcule a média de 
        aproveitamento e o conceito do aluno, usando a fórmula:

        media=(notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios)/7

        A atribuição dos conceitos obedece à tabela abaixo:

media	conceito
>= 9.0	A
>= 7.5 e < 9.0	B
>= 6.0 e < 7.5	C
>= 4.0 e < 6.0	D
< 4.0	E

O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja 
A, B ou C, e "reprovado" caso o conceito seja D ou E. */

        Scanner o = new Scanner(System.in);

      System.out.println("Digite nota da prova 1");
      double p1 = o.nextDouble();
      
      System.out.println("Digite nota da prova 2");
      double p2 = o.nextDouble();

      System.out.println("Digite nota da prova 3");
      double p3 = o.nextDouble();

      System.out.println("Digite nota dos exercícios");
      double e = o.nextDouble();

      double media = (p1 + (p2*2) + (p3*3) + e)/7;

      DecimalFormat i = new DecimalFormat("0.0");

      System.out.println("Media = " + i.format(media));
       
       if (media >= 9.0 ) {

        System.out.println("Aprovado");

       } else if (media >= 7.5 && media < 9.0) {

        System.out.println("Aprovado"); 
        
       } else if (media >= 6.0 && media < 7.5 ) {

        System.out.println("Aprovado"); 

       }else if (media >= 4.0 && media < 6.0 ) {

        System.out.println("Reprovado"); 
       
        
       } else if (media < 4.0) {

        System.out.println("Reprovado"); 

       }

       o.close();
    }
    public static void main(String[] args) {
        new ex20();
    }
}



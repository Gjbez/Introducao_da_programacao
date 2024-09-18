import java.util.Scanner;

public class ex27 {
    public ex27(){ 
        
       /*As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo.Até 29 minutos depois da chegada,
 arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por
  1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30 minutos, 
  também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas 
  e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de 
  partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. Admite-se que a 
  chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia. */

        Scanner o = new Scanner(System.in);
      System.out.println("Digite horário de chegada: ");
      System.out.println("Que horas?");
        int h = o.nextInt();
        System.out.println("Quantos minutos?");
        int min = o.nextInt();
        System.out.println("Você chegou às: " + h +":" + min);  
        
       System.out.println("quanto tempo ficou estacionado? ");
       System.out.println("Quantas horas?");
       int h2 = o.nextInt();
       System.out.println("Quantos minutos?");
       int min2 = o.nextInt();

        if (h2 < 0 && min2 > 28) {

          System.out.println(" pagará 30 minutos de estacionamento");
  
         } else if (h2 == 1 && min2 < 16) {

          System.out.println(" pagará 1 hora de estacionamento");
          
        } else if (h2 > 1 && min2 > 34) {

          System.out.println(" pagará 2 horas de estacionamento");
          
         }else if (h2 == 2 ) {

          System.out.println(" pagará 2 horas de estacionamento");
         }

       o.close();
    }
    public static void main(String[] args) {
        new ex27();
    }
}



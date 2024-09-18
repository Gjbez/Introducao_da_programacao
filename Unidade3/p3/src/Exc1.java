import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc1 {

    public Exc1(){
    
    /*uma imobiliária vende apenas terrenos retangulares.Faça um programa para ler dimensões de um terreno e
      depois exibir a área do terreno
      
analise:falta unidade de medida,foi considerado que a medida é dada em metros
Entradas: dimensões - largura e comprimento
saídas:carea em m2
Testes:

T1)
largura = 10
comprimento = 7
area = 70m2

T2)
largura = 100
comprimento = 5,2
area = 54,60 m2

T3)
largura = 10,5
comprimento = 54,60 m2

Processo/algoritmo:
ler largura
ler comprimento
largura*comprimento=area
*/
    
        Scanner wall = new Scanner(System.in);

        System.out.println("Digite comprimento");
        int largura = wall.nextInt();
        System.out.println("Digite altura");
        double comprimento = wall.nextDouble();

        double area = (largura*comprimento);
        
        DecimalFormat a = new DecimalFormat("0.0");

        System.out.println("area do terreno =" + a.format(area) + "m2");
        
        wall.close();
    }

    public static void main(String[] args){
           new Exc1();
           
        }
        


    }

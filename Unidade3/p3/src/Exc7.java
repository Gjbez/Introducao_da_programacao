import java.util.Scanner;

public class Exc7 {

    public Exc7(){

   /*Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, 
   garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato,
   faça um programa para calcular quantos litros de refrigerante ele comprou.
   
   
   * Analise:ok
   * Entrada: quantidade de latas e garrafas vao ser pagos
   * Saida: quantos litros comprados
   * Processo
   * ler n lata
   * ler n garrafa1
   * ler n garrafa2
   * 
   * valor em lde lata
   * valor em l de garrafa1
   * valor em l de garrafa2
   * total de litro = (lata*lata) + (garraa*garraA) + (garrab*garraB)
   * escrever total de litro
   * Teste1:
   */

   Scanner fab = new Scanner(System.in);

   System.out.println("numero de latas ");
   double latas = fab.nextDouble();
   System.out.println("numero de garrafas 600ml ");
   double garraa = fab.nextDouble();
   System.out.println("numero de garrafas de 2l ");
   double garrab = fab.nextDouble();

   double ml = 0.1;
   double l = 1000 * ml;
   
   double lata = 350 * ml ;
   double garraA = 600 * ml;
   double garraB = 2 * l;

   double totaldel = (lata*lata) + (garraa*garraA) + (garrab*garraB);
   
   System.out.println("quantidade total de litros: " + totaldel);

   fab.close();
    }
    public static void main(String[] args) {
        new Exc7();
    }
}

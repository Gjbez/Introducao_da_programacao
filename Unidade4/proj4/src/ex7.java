import java.text.DecimalFormat;
import java.util.Scanner;

public class ex7 {
    public ex7(){
        
        /*O custo do selo de uma carta com até 50 gramas é de R$ 0,45. As cartas com peso superior pagam um adicional de R$ 0,45 
        por cada 20 gramas, ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, 
        determine o custo do selo.Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

        Scanner o = new Scanner(System.in);

       System.out.println("entre com o peso da carta");
        int peso = o.nextInt();

        DecimalFormat i = new DecimalFormat("0.00");
    
       if ( peso <= 50) {
        System.out.println("valor a pagar = 0,45");
       } else {
        float pesoExtendido = peso - 50;
        float qtAdicional = (pesoExtendido / 20)+1;
        float valorPagar = 0.45f + 0.45f * qtAdicional;
        System.out.println("custo de selo: " + valorPagar);
       }
       
       o.close();
    }
    public static void main(String[] args) {
        new ex7();
    }
}



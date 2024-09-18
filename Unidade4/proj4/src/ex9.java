import java.util.Scanner;

public class ex9 {
    public ex9(){
        
        /*Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não. */

        Scanner o = new Scanner(System.in);

       System.out.println("escreva um valor inteiro: ");
        int v1 = o.nextInt();
        System.out.println("Escreva segundo valor inteiro");
        int v2 = o.nextInt();
         float multiplo = v1 * v2;   
    
       if ( v1 % v2 == 0 ) {
        System.out.println("é multiplo");

       } else if (v2 % v1 == 0){

        System.out.println("é multiplo");

       } else if (v1 % v2 != 0) {

        System.out.println("não é");

       }else if (v2 % v1 != 0){

        System.out.println("não é");
       }
       
       o.close();
    }
    public static void main(String[] args) {
        new ex9();
    }
}

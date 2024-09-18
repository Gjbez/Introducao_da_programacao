import java.util.Scanner;

public class ex12 {
    public ex12(){
        
        /*Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, descreva um algoritmo que
         verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. Em caso afirmativo, verifique e informe se é 
         "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". Em caso negativo, informe que os mesmos não formam
          um triângulo. Considere que:

        o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
        um triângulo equilátero tem três lados iguais
        um triângulo isóscele tem dois lados iguais e um diferente
        um triângulo escaleno tem três lados diferentes */

        Scanner o = new Scanner(System.in);

       System.out.println("Entre com o comprimento do lado 1: ");
        int l1 = o.nextInt();
        System.out.println("Entre com o comprimento do lado 2: ");
        int l2 = o.nextInt();
        System.out.println("Entre com o comprimento do lado 3: ");
        int l3 = o.nextInt();   
    
        boolean triangulo = l1 < (l2 + l3) && l2 < (l1 + l3) && l3 < (l1 + l2);
        
       if ( triangulo ) {
        System.out.println("forma um triangulo ");
       } else {
        System.out.println("não formam um triangulo");
       } if (l1 == l2 && l1 == l3){
       System.out.println("equilatero");
     } else if (l1 == l2 || l2 == l3 || l1 == l3) {
     System.out.println("isóceles");
     } else {
      System.out.println("escaleno");
     } 


       o.close();
    }
    public static void main(String[] args) {
        new ex12();
    }
}

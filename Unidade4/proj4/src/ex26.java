import java.util.Scanner;

public class ex26 {
    public ex26(){ 
        
       /*Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r */

        Scanner o = new Scanner(System.in);

      System.out.println("escolha uma opção: ");
      System.out.println("Digite 'T' para calcular a área de um triângulo de base b e altura h");
      System.out.println("Digite 'Q' para calcular a área de um quadrado de lado l");
      System.out.println("Digite 'R' para calcular a área de um retângulo de base b e altura h");
      System.out.println("Digite 'C' para calcular a área de um círculo de raio r");
        String resposta  = o.nextLine();
        resposta = resposta.toUpperCase(); 
        char letra = resposta.charAt(0);
       

        switch (letra) {
          case 'T':  System.out.println("Digite valor da Base: ");
                   int b = o.nextInt();
                   System.out.println("Digite valor da Altura: ");
                   int h = o.nextInt();
                   float t = (b*h)/2;
                   System.out.println("área do triângulo = " + t);
            break;
          case 'Q':  System.out.println("Digite valor do Lado: ");
                     int l = o.nextInt();
                     float q = l*l;
                     System.out.println("área do quadrado = " + q);
            break;
          case 'R':   System.out.println("Digite valor da Base: ");
                      int b2 = o.nextInt();
                      System.out.println("Digite valor da Altura: ");
                      int h2 = o.nextInt();
                      float r = b2*h2;
                     System.out.println("área do retângulo = " + r );
            break;
          case 'C': System.out.println("Digite valor do Raio: ");
                    int r2 = o.nextInt();
                    float pi = 3.14f;
                    float c = pi*(r2*r2);
                    System.out.println("área do círculo = " + c);
            break;
            default: System.out.println("erro");
            break;
        }
       /*if (letra == 'T') {

        System.out.println("Digite valor da Base: ");
        int b = o.nextInt();
        System.out.println("Digite valor da Altura: ");
        int h = o.nextInt();
        
        float t = (b*h)/2;
        
        System.out.println("área do triângulo = " + t);

       } else if (letra == 'Q') {
        
        System.out.println("Digite valor do Lado: ");
        int l = o.nextInt();
        float q = l*l;
        

        System.out.println("área do quadrado = " + q);
        
       } else if (letra == 'R') {
        
        System.out.println("Digite valor da Base: ");
        int b = o.nextInt();
        System.out.println("Digite valor da Altura: ");
        int h = o.nextInt();
        float r = b*h;

        System.out.println("área do retângulo = " + r );
        
       } else if (letra == 'C') {

        System.out.println("Digite valor do Raio: ");
        int r = o.nextInt();
        float pi = 3.14f;
        float c = pi*(r*r);

        System.out.println("área do círculo = " + c);
        
       } else {
        System.out.println("erro");
       }
       */
       o.close();
    }
    public static void main(String[] args) {
        new ex26();
    }
}



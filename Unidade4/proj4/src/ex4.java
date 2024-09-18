import java.util.Scanner;

public class ex4 {
    public ex4(){    

        /*Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número
         */
        Scanner o = new Scanner(System.in);

       System.out.println("Digite algum número");
         double n = o.nextDouble();
       
         //forma 1
        if ( n % 1 == 0 ) {
        System.out.println("não há casas decimais");
       } else {
        System.out.println("há casas decimais");
       } 
//---------------------------------------------------------------------------------------------
       //forma 2
       int ninteiro = (int) (n);
       if (n == ninteiro) {
        System.out.println("Não há casas decimais");
       } else {
        System.out.println("Há casas decimais");
       }
//---------------------------------------------------------------------------------------------
       //forma 3
      //converte um número para String:
      String numeroString = String.valueOf(n);
      System.out.println("número convertido: " + numeroString);
       int indiceinicial = numeroString.indexOf("."); //retorna indice do caractere
       int indicefinal = numeroString.length(); // tamanho da String
       String decimal = numeroString.substring(indiceinicial + 1, indicefinal);
       System.out.println("Parte decimal + decimal");

       int partedecimal = Integer.parseInt(decimal);
       if (partedecimal == 0) {
        System.out.println("não há casas decimais");
       } else {
        System.out.println("há casas decimais");
       }

       if(decimal.trim().equals("0")) {
        System.out.println("não há casas decimais");
       } else {
        System.out.println("há casas decimais");
       }

       o.close();
    }
    public static void main(String[] args) {
        new ex4();
    }
}



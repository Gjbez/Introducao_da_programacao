import java.util.Scanner;

public class ex8 {
    public ex8(){
        
        /* Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:*/

        Scanner o = new Scanner(System.in);

       System.out.println("informe letra");
        String resposta  = o.nextLine();
        resposta = resposta.toUpperCase(); 
        char letra = resposta.charAt(0);
     
    
       if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ) {
        System.out.println("é vogal");

       } else {
        System.out.println("não é vogal");
       }
       
       o.close();
    }
    public static void main(String[] args) {
        new ex8();
    }
}


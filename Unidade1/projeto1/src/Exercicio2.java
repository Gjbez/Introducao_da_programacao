import java.util.Scanner;

public class Exercicio2 {
        
    /*Modele a solução de um problema para caalcular a área de uma
     sala retangular. 
     Considere que as medidas estão expressas em metros*/
    
    //Construtor da classe: possui o MESMO NOME da classe
     public Exercicio2() { 
      Scanner teclado = new Scanner(System.in); 
   
   
    float altura;     
    float largura; 
    
    //altura = 6;
    System.out.print("Digite a altura em metros");
    altura = teclado.nextFloat();
    
    //largura = 4.5f;
    System.out.println("Digite a largura em metros");
    largura = teclado.nextFloat();

    float área = (altura * largura);
    
    System.out.println("área = "+ área + "m2"); 
  
    teclado.close();

    }
    
    
    public static void main(String args[]) {
       new Exercicio2(); //chama o construtor da classe 
  }    
}

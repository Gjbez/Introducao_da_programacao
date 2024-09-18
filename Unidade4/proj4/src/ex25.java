import java.util.Scanner;

public class ex25 {
    public ex25(){ 
        
       /*Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente.
        O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:

Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).*/

        Scanner o = new Scanner(System.in);
        System.out.println("digite 2 valores: ");
        int v1 = o.nextInt();
        int v2 = o.nextInt();

      System.out.println("escloha uma opção: ");
      System.out.println("1 - Soma de dois números");
      System.out.println("2 - Diferença entre dois números");
      System.out.println("3 - Produto entre dois números");
      System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        int resposta = o.nextInt();
        
        
        switch (resposta){
          case 1:   float soma = v1 + v2;
                    System.out.println("Soma de dois números: " + soma);
          break;
          case 2:    float diferença = v1 - v2;
                    System.out.println("Diferença entre dois números: " + diferença);  
          break;
          case 3:    float produto = v1*v2;
                    System.out.println("Produto entre dois números:" + produto); 
          break;
          case 4:    double divisão = v1/v2;
                     System.out.println("Divisão entre dois números: " + divisão); 
          break;
          default: System.out.println("erro");
        }
       /* 
       if (resposta == 1) {
        
        float soma = v1 + v2;
        System.out.println("Soma de dois números: " + soma);

       } else if (resposta == 2) {

        float diferença = v1 - v2;
        System.out.println("Diferença entre dois números: " + diferença);
        
       }else if (resposta == 3) {

        float produto = v1*v2;
        System.out.println("Produto entre dois números:" + produto);

       }else if (resposta == 4) {

        float divisão = v1/v2;
        System.out.println("Divisão entre dois números: " + divisão);

       }else{
        System.out.println("erro");
       }
      */
      
      o.close();
    }
    public static void main(String[] args) {
        new ex25();
    }
}



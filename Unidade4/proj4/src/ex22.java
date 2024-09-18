import java.util.Scanner;

public class ex22 {
    public ex22(){ 
        
       /*Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. 
       Considerando que o sistema apresenta 3 cursos disponíveis (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 
       – Sistemas de Informação) descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título que 
       o aluno vai receber caso opte por aquele curso. As titulações são respectivamente: "Bacharel em Ciência da Computação", 
       "Licenciado em Computação" e "Bacharel em Sistemas de Informação".*/

        Scanner o = new Scanner(System.in);
      System.out.println("qual curso vai optar? digite '1' para ciencia da computação,digite '2' para licenciatura da computação,digite '3' para sistemas da informação");
        int resposta = o.nextInt();
          
       /* 
       if (resposta == 1) {

        System.out.println("Bacharel em Ciencia da computação");

       } else if (resposta == 2) {

        System.out.println("Licenciado em Computação");
        
       } else if (resposta == 3) {

        System.out.println("Bacharel em Sistemas de Informação");

       }else {

        System.out.println("erro");

       }*/

       switch (resposta){
       case 1: System.out.println("Bacharel em Ciencia da computação");
       break;
       case 2: System.out.println("Licenciado em Computação");
       break;
       case 3: System.out.println("Bacharel em Sistemas de Informação");
       break;
       default:
       System.out.println("erro");
       }

       o.close();
    }
    public static void main(String[] args) {
        new ex22();
    }
}



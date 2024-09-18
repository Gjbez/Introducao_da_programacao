import java.util.Scanner;

public class Ex1 {
    public Ex1(){

       /*
     * uma empresa codificou seus clientes por um codigo de categoria,sendo: A para Classe A; X para Classe média e W para clientes
     * idosos.Faça com que se leia o código,e dependendo de qual código for se escreva o nome da categoria correspondente.
     * Qualquer outro código digitado escreva "Entrada Incorreta".
     * Atenção: antes de testar a letra,converta-a para maiúscula.Não é para se usar o comando Swich(java)
     * 
     * 
     */

       Scanner o = new Scanner(System.in);

       System.out.println("Digite o código de cliente:");
       System.out.println("Digite A para Classe A; X para Classe média e W para clientes idosos");
       String resposta = o.nextLine();
       resposta = resposta.toUpperCase();
       char letra = resposta.charAt(0);

       if(letra == 'A'){

        System.out.println("Classe A");
       }
       else if (letra == 'X'){
        
        System.out.println("Classe média");
       }
       else if (letra == 'W'){

        System.out.println("Classe para clientes idosos");
       }
       else{
        System.out.println("Entrada incorreta");
       }


       o.close();
    }
    public static void main(String[] args) {
        new Ex1();
    }
}

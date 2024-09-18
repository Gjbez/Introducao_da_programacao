import java.util.Scanner;

public class ex13 {
    public ex13(){
        
        /*Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas deste usuário em uma mão de 
        jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a palavra 
        "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" 
        (se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
        Dica: criar variáveis intermediárias para contar a quantidade de "boas".*/

        Scanner o = new Scanner(System.in);

       System.out.println("informe as 3 cartas");
        int c1 = o.nextInt();
        int c2 = o.nextInt();
        int c3 = o.nextInt();
            
        int qtb = 0;

       if ( c1 == 1||c1 == 2||c1 == 3 ) {
        
        qtb += 1;

       } if (c2 == 1||c2 == 2||c3 == 3) {

        qtb = qtb + 1;

       } if (c3 == 1||c3 == 2||c3 == 3) {

        qtb++;

       }    
       if (qtb ==1) {

        System.out.println("truco");
        
       }else if (qtb == 2){
        System.out.println("seis");
       }else if (qtb == 3){
        System.out.println("nove");
       }

       switch (qtb){
        case 1: System.out.println("Truco");
        break;
        case 2: System.out.println("Seis");
        break;
        case 3: System.out.println("Nove");
        break;
        default:
        System.out.println("segue o jogo");
       }

       o.close();
    }
    public static void main(String[] args) {
        new ex13();
    }
}

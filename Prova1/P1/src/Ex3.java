import java.util.Scanner;

public class Ex3 {
    public Ex3(){

       /*
     * faça com base no fluxograma da prova
     */
    
       Scanner o = new Scanner(System.in);

       String nome = "Teste";
       String pais = "Brasil";
        boolean a = o.nextBoolean();


       if(a == true){

        System.out.println("Dados incorretos");
       }
       else if (a == false) {

        System.out.println("Nome: " + nome);
        System.out.println("Pais: " + pais);
       }
        
       System.out.println("Acabei");
    
       o.close();
    }
    public static void main(String[] args) {
        new Ex3();
    }
}
import java.util.Scanner;

public class ex1 {
    public ex1(){

        //FOR
        //for (inicialização ; condição ; finalização){}
        for (int contador = 0; contador < 5; contador++)
        System.out.println(contador); 

        //WHILE
        int contador = 0;
        while (contador < 5) {
            System.out.println("While " + contador);
            contador++;
        }

        //DO-WHILE
        int cont2 = 0;
        do {
            System.out.println("Do-While: " + cont2);
            cont2++;
        } while (cont2 < 0);

        Scanner s = new Scanner(System.in);
        String nome = "";
        do{
            System.out.println("Digite o nome:");
            nome = s.nextLine();
        }while (nome.trim().equals(""));
        System.out.println("Nome = " + nome);

        System.out.println("Digite o nome: ");
        String nome2 = s.nextLine();
        while (nome2.trim().equals("")) {
            System.out.println("Digite o nome: ");
            nome = s.nextLine();
        }
        System.out.println("Nome = " + nome2);
        s.close();
    }
    public static void main(String[] args) {
        new ex1();
    }
}

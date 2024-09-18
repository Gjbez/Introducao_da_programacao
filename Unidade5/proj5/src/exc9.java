import java.util.Scanner;

public class exc9 {
    public exc9() {

        /*
         * Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um
         * algoritmo que:
         * 
         * escreva os nomes dos alunos que tem 18 anos;
         * escreva a quantidade de alunos que tem idade acima de 20 anos.
         */

        Scanner o = new Scanner(System.in);
        System.out.println("Quantidade de alunos: ");
        int n = o.nextInt();
        int quantidademaior20 = 0;
        String alunos18anos = "";

        for (int i = 0 ; i < n; i++)
        {
            System.out.println("Nome do aluno: ");
            String nome = o.next();

            System.out.println("Idade do aluno: ");
            int idade = o.nextInt();


            if (idade == 18)
            {
                alunos18anos += nome;
            }
            else if (idade > 20) {
                quantidademaior20++;
            }
        }
        System.out.println("");
        System.out.println("Os nomes dos alunos com 18 anos são: " + alunos18anos);
        System.out.println("Quantidade de alunos com mais de 20 anos: " + quantidademaior20);


        o.close();
    }  
    public static void main(String[] args) {
        new exc9();
    }
}

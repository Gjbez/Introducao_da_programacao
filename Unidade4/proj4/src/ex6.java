import java.util.Scanner;
public class ex6 {
    public ex6(){

    /*Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. 
    Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”.
     Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.
     
    entrada: caractere - "abreviação do sexo"
    saida: sexo
    processo:
    ler caractere
    se caractere é M
    escrever masculino
    se caractere for f
    escrever feminino
    se caractere for i
    escrever nçao informado
    senao
    sescrever entrada incorreta

    teste:
    caractere- f / feminino
    caractere- m / masculino
    caractere- j / entrada incorreta
 
     */

        Scanner o = new Scanner(System.in);

       System.out.println("digite F pra feminino,M pra masculino,I pra não informar");
       String ca = o.nextLine();
       //toUpperCase para converter todas as letras em maiusculas
       //toLowerCase pra converter pra letra minuscula
       ca = ca.toUpperCase(); 
       //charAt é um método da String que pega somente 1 caractere
       //conforme o indice e converte para char
       char letra = ca.charAt(0);

       //char ex = o.nestline().toUpperCase().charAt(0);

       if (letra =='M') {
        System.out.println("Masculino");
       } else if (letra == 'F') {
        System.out.println("Feminino");
       }else if (letra == 'I') {
        System.out.println("Não informado");
       } else {
        System.out.println("Entrada Inválida");
       }
       o.close();
    }
    public static void main(String[] args) {
        new ex6();
    }
}

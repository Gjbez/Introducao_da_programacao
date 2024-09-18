import java.util.Scanner;

public class ex11 {
    public ex11(){
        
        /*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escrever uma mensagem que indique se eles são 
        TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente
         dos demais, e apenas irmãos se todas as idades forem diferentes.
 */

        Scanner o = new Scanner(System.in);

       System.out.println("escreva ano de nascimento de filho 1");
        int f1 = o.nextInt();
        System.out.println("escreva ano de nascimento de filho 2");
        int f2 = o.nextInt();
        System.out.println("escreva ano de nascimento de filho 3");
        int f3 = o.nextInt();
    
       if (f1 == f2 && f2 == f3 && f1 == f3) {
         System.out.println("São trigemeos");
       } else if (f1 == f2 && f2 != f3 && f1 != f3){
        System.out.println("são gemeos");
       } else if (f1 != f2 && f2 == f3 && f3 != f1){
       System.out.println("são gemeos");
       } else if (f1 == f3 && f1 != f2 && f3 == f1) {
       System.out.println("são gemeos");
       } else 
       System.out.println("são apenas irmãos");
       
    o.close();
    }
    public static void main(String[] args) {
        new ex11();
    }
}

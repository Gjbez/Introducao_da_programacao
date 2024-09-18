import java.text.DecimalFormat;
import java.util.Scanner;

public class Exc3 {
    public Exc3(){
        /* um motorista deseja abastecer seu tanque de combustível.
        Escreva um program para ler o preço do litro da gasolina e o valor do
        pagamento e exibir quantos litros ele conseguiu colocar no tanque.
        
        Analise: ok
        Entrada:valorLitro,valorPagamento
        Saída: quantidadeLitro
        Testes:
        1)
        valorLitro = 6,47
        valorPagamento = 100
        quantidadeLitro = 40
        2)
        valorLitro = 6,47
        valorPagamento = 100
        quantidadeLitro = 15,46
        3)
        valorLitro = 10
        valorPagamento = 20
        quantidadeLitro = 2
        ler valorLitro
        ler valorPagamento
        quantidadeLitro = valorPagamento / valorLitro
        escrever quantidadeLitro
        */

        Scanner liq = new Scanner(System.in);
        
        System.out.println("Digite valor do litro R$");
        float valorLitro = liq.nextFloat();
        System.out.println("Digite valor a pagar R$");
        float valorPagamento = liq.nextFloat();

        float quantidadeLitro = valorPagamento / valorLitro;

        DecimalFormat dif = new DecimalFormat("0.0");

        System.out.println("A quantidade de litros foi de " + dif.format(quantidadeLitro) + " litros");
        liq.close();
    }
    public static void main(String[] args) {
        new Exc3();
    }
}

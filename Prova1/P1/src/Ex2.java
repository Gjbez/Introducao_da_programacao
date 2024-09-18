import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
       


/*
     * Um evento com palestras da área de tecnologia acontece em diversas cidades do Brasil,contudo,o valor da inscrção varia 
     * conforme a localização.Considerando assim que este varia conforme a localização,a organização do evento precisa calcular
     * o valor médio que recebe com todas as inscrições realizadas no país.
     * Nesse caso,ele irá se basear nas últimas 3 inscrições recebidas,sendo que cada uma delas é obrigatoriamente de uma cidade
     * diferente e possui valor diferente(não precisa consistir se são diferentes,sempre será digitado valores diferentes,porém
     * precisa consistir se o valor é maior do que zero).O valor da iinscrição será informada em qualquer ordem de entrada.Após
     * a coleta dos valores,a organização do evento deseja saber algumas informações relacionadas a elas.Para isso se tem um menu
     * com as opções(menu deve usar o comando switch em vez de if/else).
     * 
     * Menu
     * a) valor da inscrição mais alta
     * b) valor da inscrição mais baixa
     * c) valores impressos em ordem decrescente
     * d) média das três inscrições informadas
     * 
     * Digite apenas três valores de cada mês
     */
    
     Scanner o = new Scanner(System.in);
    
     System.out.println("Digite 'a' para valor de inscrição mais alto");
     System.out.println("Digite 'b' para valor de inscrição mais baixa");
     System.out.println("Digite 'c' para valores impressos em ordem decrescente");
     System.out.println("Digite 'd' para média das três inscrições informadas");
     String resposta = o.nextLine();
     char letra = resposta.charAt(0);
      

      switch(letra){
          case 'a': 
          System.out.println("Digite valor da inscrição");
          float valor = o.nextFloat();
          System.out.println("Digite mês de inscrição 1");
          int mes1 = o.nextInt();
          System.out.println("Digite mês de inscrição 2");         
          int mes2 = o.nextInt();
          System.out.println("Digite mês de inscrição 3");         
          int mes3 = o.nextInt();
          int mes = Math.max(Math.max(mes1, mes2), mes3);
          float preço = valor * mes;
          System.out.println("Inscrição mais alta: R$" + preço);
          break;

          case 'b':
          System.out.println("Digite valor da inscrição");
      float valor2 = o.nextFloat();
     System.out.println("Digite mês de inscrição 1");
      int mes4 = o.nextInt();
      System.out.println("Digite mês de inscrição 2");         
      int mes5 = o.nextInt();
      System.out.println("Digite mês de inscrição 3");         
      int mes6 = o.nextInt();
          int mesA = Math.min(Math.max(mes4, mes5), mes6);
          float preçoa = valor2 * mesA;
          System.out.println("Inscrição mais baixa: R$" + preçoa);
          break;

          case 'c':
          System.out.println("Digite valor da inscrição");
          float valor3 = o.nextFloat();
          System.out.println("Digite mês de inscrição 1");
          int mes7 = o.nextInt();
          System.out.println("Digite mês de inscrição 2");         
          int mes8 = o.nextInt();
          System.out.println("Digite mês de inscrição 3");         
          int mes9 = o.nextInt();
          float preço1 = mes7*valor3;
          float preço2 = mes8*valor3;
          float preço3 = mes9*valor3;
          float maior = 0;
          float menor = 0;
          float medio = 0;

          if (preço1 > preço2 && preço1 > preço3){
            maior = preço1;
          }
          else if (preço2 > preço3){
            maior = preço2;
          }
          else {
            maior = preço3;
          }
          if (preço1 < preço2 && preço1 < preço3) {

            menor = preço1;
      
          } else if (preço2 < preço3) {
      
            menor = preço2;
      
          } else {
      
            menor = preço3;
          }
      
          if (preço1 < preço2 && preço1 > preço3 || preço1 > preço2 && preço1 < preço3) {
      
            medio = preço1;
      
          } else if (preço2 < preço1 && preço2 > preço3 || preço2 > preço1 && preço2 < preço3) {
      
            medio = preço2;
      
          } else if (preço3 < preço1 && preço3 > preço2 || preço3 > preço1 && preço3 < preço2) {
      
            medio = preço3;
      
          }

          System.out.println("Valores de Inscrição em ordem decrescente: R$" + maior + " " + medio + " " + menor);
          break;

          case 'd':
          System.out.println("Digite valor da inscrição");
          float valor4 = o.nextFloat();
          System.out.println("Digite mês de inscrição 1");
          int mes10 = o.nextInt();
          System.out.println("Digite mês de inscrição 2");         
          int mes11 = o.nextInt();
          System.out.println("Digite mês de inscrição 3");         
          int mes12 = o.nextInt();
          float média = ((valor4*mes10) + (valor4*mes11) + (valor4*mes12))/3;
          System.out.println("Média dos valores de Inscrição: R$" + média);

      }
     o.close();

    }
}

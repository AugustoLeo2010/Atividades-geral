public class teste01 {
public static void main(String []args) {

    int real = 5000;
    double dolar = 5.15;
    double euro = 5.85;


    String escolha;

   IO.println("======MENU DE TRANSFERENCIA======");
   IO.println("1.Saldo atual");
   IO.println("2.Converter para Dolar");
   IO.println("3.Converter para Euro");
   escolha = IO.readln("Digite a opção de sua escolha: ");






       if (escolha.equals("1")) {
           IO.println("");
           IO.println("Seu saldo atual em Reais e de " + real + "$");

       } else if (escolha.equals("2")) {
           IO.println("");
           real = Integer.parseInt(IO.readln("Qual o valor deseja converter para Dolar?: "));
           double converterDolar = real / dolar;

           IO.println("O valor de " + real + "$" + " foi convertido em " + converterDolar + " Dolares");


       } else if (escolha.equals("3")) {
           IO.println("");
           real = Integer.parseInt(IO.readln("Qual o valor deseja converter para Euro?: "));
           double converterEuro = real / euro;

           IO.println("O valor de " + real + "$" + " foi convertido em " + converterEuro + " Euros");


       } else {
           IO.println("");
           IO.println("OPÇÃO INEXISTENTE");
       }

   }
}


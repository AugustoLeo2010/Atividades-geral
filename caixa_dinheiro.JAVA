import java.util.Scanner;

       public class caixa_dinheiro {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       IO.println("Você deseja entrar no caixa online? S/N: ");
       String entrada = sc.nextLine();

       if (entrada.equals("S")) {
       IO.println("Você entrou no caixa online.");

       }else if (entrada.equals("N")) {
       IO.println("Você encerrou as atividades.");
       System.exit(0);

       }else{
              System.exit(0);
       }

       IO.println("1-Saque");
       IO.println("2-Deposito");
       IO.println("3-Saldo");
       IO.println("0-Sair");
       String opção = sc.nextLine();

       if (opção.equals("1")) {
              IO.println("Você deseja sacar quanto?: ");
              int sacar = Integer.parseInt(sc.nextLine());
              if (sacar > 500) {
                     IO.println("Você não pode sacar mais dinheiro!");
              }else if (sacar <= 500) {
                     IO.println("Você sacou o valor selecionado");
              }
      
       }else if (opção.equals("2")) {
              IO.println("Quanto você deseja depositar?: ");
              int depositar = Integer.parseInt(sc.nextLine());
              if (depositar > 0) {
                     IO.println("Seu Dinhero foi depositado");
              }
              
       }else if (opção.equals("3")) {
              IO.println("Seu saldo atual é de R$500");
       }else if (opção.equals("0")) {
              IO.println("Você saiu do caixa online");
       System.exit(0);
       }
       
       
       }
       }

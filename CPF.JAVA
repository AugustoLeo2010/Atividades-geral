 import java.util.Scanner;

       public class teste_1 {
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       IO.println("Digite o CPF: ");
       String cpf = scanner.nextLine();

              if (cpf.length() != 11) {
                     IO.println("CPF invalido");
              }else{
                     IO.println("CPF valido");
              }
              scanner.close();
              
       }
       }

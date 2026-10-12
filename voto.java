 import java.util.Scanner;

        public class teste_1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voto = 0;
        int maria = 0;
        int joao = 0;

        for (int i = 1; i <= 10; i++) {
            IO.println("Digite seu voto: ");
            voto = sc.nextInt();

          if (voto == 1) {
           IO.println("Você votou em João" + - voto);

          }else if (voto == 2) {
         IO.println("Você votou em Maria" + - voto);

          }else{
              IO.println("você votou nulo" + - voto);
            }
             }

          if (voto == 1) {
              IO.println("O vencedor da eleição foi o " + "João" + - voto);

          }else if (voto == 2) {
              IO.println("O vencedor da eleição foi a " + "Maria" + - voto);
          }

          
        }
        }

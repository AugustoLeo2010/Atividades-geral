import java.util.Scanner;

public class teste_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma_par = 0;
        int soma_impar = 0;
        int par = 0;
        int impar = 0;
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            IO.println("Digite o " + i + "º numero:");
            numero = sc.nextInt();

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            if (numero % 2 == 0) {
                soma_par += numero;
                par++;
            }else{
             soma_impar += numero;
             impar++;

            }

        }

       double media = (double) soma / 10;

       IO.println("\nResultados: ");
       IO.println("Soma: " + soma);
       IO.println("Maior numero: " + maior);
       IO.println("Menor numero: " + menor);
       IO.println("Soma pares: " + soma_par);
       IO.println("Soma impares: " + soma_impar);
       IO.println("Numeros pares: " + par);
       IO.println("Numeros impares: " + impar);

       sc.close();
        }
    }

public class teste {
    void main() {

        int[][] matriz = new int[2][2];
        int soma = 0;

        matriz[0][0] = 2;
        matriz[0][1] = 4;

        matriz[1][0] = 6;
        matriz[1][1] = 8;

        soma = 0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                soma += matriz[l][c];
            }


        }
        IO.println("A soma das matrizes é: " + soma);
        

        }

    }

public class teste {
    void main() {

        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;

        matriz[0][0] = 2;
        matriz[0][1] = 4;
        matriz[0][2] = 4;

        matriz[1][0] = 6;
        matriz[1][1] = 8;
        matriz[1][2] = 10;

        matriz[2][0] = 12;
        matriz[2][1] = 14;
        matriz[2][2] = 16;

        for (int i = 1;i < matriz.length; i++) {
            for (int j = 1;j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        IO.println("O maior numero da matriz é:" + maior);





        }

    }


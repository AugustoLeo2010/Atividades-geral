public class teste {
    void main() {

        float[][] matriz = new float[3][3];

        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;


        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;

        matriz[2][0] = 70;
        matriz[2][1] = 80;
        matriz[2][2] = 90;

        IO.println("Coluna 1 | Coluna 2 | Coluna 3");
        IO.println("      " + matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2]);
        IO.println("");
        IO.println("      " + matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2]);
        IO.println("");
        IO.println("      " + matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2]);




        }

    }

public class teste {
    void main() {

        String[][] matriz = new String[3][3];

        matriz[0][0] = IO.readln("Digite o Simbolo(x/o): ");
        matriz[0][1] = IO.readln("Digite o Simbolo(x/o): ");
        matriz[0][2] = IO.readln("Digite o Simbolo(x/o): ");

        matriz[1][0] = IO.readln("Digite o Simbolo(x/o): ");
        matriz[1][1] = IO.readln("Digite o Simbolo(x/o): ");
        matriz[1][2] = IO.readln("Digite o Simbolo(x/o): ");

        matriz[2][0] = IO.readln("Digite o Simbolo(x/o): ");
        matriz[2][1] = IO.readln("Digite o Simbolo(x/o): ");
        matriz[2][2] = IO.readln("Digite o Simbolo(x/o): ");

       IO.println(matriz[0][0] + " | " + matriz[0][1] + " | " + matriz[0][2]);
       IO.println("_________");
       IO.println(matriz[1][0] + " | " + matriz[1][1] + " | " + matriz[1][2]);
       IO.println("_________");
       IO.println(matriz[2][0] + " | " + matriz[2][1] + " | " + matriz[2][2]);






        }

    }

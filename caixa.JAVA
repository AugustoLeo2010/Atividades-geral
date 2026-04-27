public class caixa {
    public static void main(String[] args) {

        int total = 0;
        int produtos = 0;
        while (true) {
            int valor = Integer.parseInt(IO.readln("Digite o valor do produto: "));


            if (valor == 0) {
                IO.println("Compra finalizada");
                System.exit(0);
            }
            total = total + valor;
            IO.println("O valor total da compra é de: " + total);

        }
    }
}

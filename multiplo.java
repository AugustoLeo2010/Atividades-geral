ublic class multiplo {
    public static void main(String[] args) {
    int conta = 0;
    int numero = 1;

    while (numero <= 99) {
        if (numero % 3 == 0) {
            IO.println(numero);
            conta = numero + conta;
        }
      numero ++;


    }
        IO.println("O valor total dos numeros é " + conta);
    }
}

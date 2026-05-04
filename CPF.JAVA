import java.util.Scanner;

public class ValidadorCPF {
    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", ""); // remove tudo que não for número

        // Regra 1: precisa ter 11 dígitos
        if (cpf.length() != 11) return false;

        // Regra 2: não pode ser sequência igual (11111111111)
        if (cpf.matches("(\\d)\\1{10}")) return false;

        try {
            int soma = 0;
            int resto;

            // Primeiro dígito
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            resto = (soma * 10) % 11;
            if (resto == 10 || resto == 11) resto = 0;
            if (resto != (cpf.charAt(9) - '0')) return false;

            soma = 0;

            // Segundo dígito
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            resto = (soma * 10) % 11;
            if (resto == 10 || resto == 11) resto = 0;
            if (resto != (cpf.charAt(10) - '0')) return false;

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }

        sc.close();
    }
}

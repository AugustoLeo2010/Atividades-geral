import java.lang.IO.*;
void main() {

    int senha = 4321;
    int tentativas = 1;
    while (tentativas <= 3) {
        int senha_digitada = Integer.parseInt(IO.readln("Digite a senha: "));
        if (senha_digitada == senha) {
            IO.println("Acesso Liberado");
            break;

        } else {
            IO.println("Senha incorreta");
        }


    }
}

import java.lang.IO.*;
public class situacao_escolar {
    public static void main(String[] args) {

        int aluno = 1;
        while (aluno <= 4) {

            int soma = 0;
            int nota = 1;

            while (nota <= 4) {
                int valor = Integer.parseInt(IO.readln("Aluno-" + aluno + " - Digite a nota " + nota + ":"));

                soma += valor;
                nota++;
            }
            int media = soma / 4;
            if (media >= 7) {
                IO.println("Aluno-" + aluno + " Aprovado");

            } else if (media <= 6.9 && media >= 5 ) {
                IO.println("Aluno-" + aluno + " Recuperação");

            } else if (media <= 4) {
                IO.println("Aluno-" + aluno + " Reprovado");
            }

            IO.println("Media do aluno-" + aluno + ": " + media);
            aluno++;

        }

    }
}

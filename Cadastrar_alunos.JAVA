public class Leo {
    public static void main(String[] args) {

        String opcao;

        String[] nomes = new String[10];
        int[] idades = new int[10];
        String[] cursos = new String[10];

        int quantidade = 0;

        while (true) {

            IO.println("\n===== Cadastro de Alunos =====");
            IO.println("1 - Cadastrar Aluno");
            IO.println("2 - Alterar Aluno");
            IO.println("3 - Excluir Aluno");
            IO.println("4 - Listar Cadastros");
            IO.println("5 - Sair");

            opcao = IO.readln("Digite a opção desejada: ");

            // CADASTRAR
            if (opcao.equals("1")) {

                if (quantidade < 10) {

                    nomes[quantidade] =
                            IO.readln("Digite o nome do aluno: ");

                    idades[quantidade] =
                            Integer.parseInt(IO.readln("Digite a idade: "));

                    cursos[quantidade] =
                            IO.readln("Digite o curso: ");

                    IO.println("Aluno cadastrado com sucesso!");

                    quantidade++;

                } else {
                    IO.println("Limite de alunos atingido.");
                }
            }

            // ALTERAR
            else if (opcao.equals("2")) {

                String nomeBusca =
                        IO.readln("Digite o nome do aluno que deseja alterar: ");

                boolean encontrado = false;

                for (int i = 0; i < quantidade; i++) {

                    if (nomes[i].equalsIgnoreCase(nomeBusca)) {

                        nomes[i] = IO.readln("Novo nome: ");

                        idades[i] = Integer.parseInt(
                                IO.readln("Nova idade: "));

                        cursos[i] = IO.readln("Novo curso: ");

                        IO.println("Cadastro alterado com sucesso!");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    IO.println("Aluno não encontrado.");
                }
            }

            // EXCLUIR
            else if (opcao.equals("3")) {

                String nomeBusca =
                        IO.readln("Digite o nome do aluno que deseja excluir: ");

                boolean encontrado = false;

                for (int i = 0; i < quantidade; i++) {

                    if (nomes[i].equalsIgnoreCase(nomeBusca)) {

                        for (int j = i; j < quantidade - 1; j++) {
                            nomes[j] = nomes[j + 1];
                            idades[j] = idades[j + 1];
                            cursos[j] = cursos[j + 1];
                        }

                        quantidade--;

                        IO.println("Aluno excluído com sucesso!");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    IO.println("Aluno não encontrado.");
                }
            }

            // LISTAR
            else if (opcao.equals("4")) {

                IO.println("\n===== Lista de Cadastros =====");

                if (quantidade == 0) {
                    IO.println("Nenhum aluno cadastrado.");
                } else {

                    for (int i = 0; i < quantidade; i++) {

                        IO.println(
                                "\nAluno: " + nomes[i] +
                                "\nIdade: " + idades[i] +
                                "\nCurso: " + cursos[i]
                        );
                    }
                }
            }

            // SAIR
            else if (opcao.equals("5")) {

                IO.println("Programa encerrado.");
                break;
            }

            else {
                IO.println("Opção inválida.");
            }
        }
    }
}

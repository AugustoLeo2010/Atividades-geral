public class ContaCorrente {
    public static void main(String[] args) {

        //valores da codigo

        String nome = IO.readln("Digite o nome da conta: ");

        if (nome.equals("Augusto")) {
            IO.println("Usuario Augusto");
        } else if (nome.equals("Pedro")) {
            IO.println("Usuario Pedro");
        } else {
            System.exit(0);
        }

        float senha = Float.parseFloat(IO.readln("Digite sua senha: "));

        //Usuario Augusto

        if (nome.equals("Augusto") && senha == 190410) {
            IO.println("Bem vindo usuario Augusto");
            IO.println("Nascimento: 19/04/10");
            IO.println("Agencia: ########");
            IO.println("Oque voçê deseja fazer?: ");
            IO.println("1.Saldo");
            IO.println("2.Transferencia");
            IO.println("3.Cancelar a conta");
            IO.println("4.Consultar o extrato");
            IO.println("5.Consultar saldo atual");
            String opcao = IO.readln();

            if (opcao.equals("1")) {
                IO.println("Quanto deseja sacar?: ");

            } else if (opcao.equals("2")) {
                IO.println("Para qual conta deseja transferir?: ");
                String transferencia = IO.readln();
                int valor = 0;

                if (transferencia.equals("Pedro")) {
                    valor = Integer.parseInt(IO.readln("Digite o valor da transferencia: "));
                }else {
                    System.exit(0);
                }
                if (valor > 1000 || valor <= 0) {
                    IO.println("Não a como transferir esse valor");
                }else if (valor <= 1000 && valor > 0 ){
                    IO.println("O valor foi transferido");
                }

            } else if (opcao.equals("3")) {
                IO.println("Porque deseja cancelar a conta?: ");

            } else if (opcao.equals("4")) {
                IO.println(": ");

            }else if (opcao.equals("5")) {
                    IO.println("Seu saldo atual é de R$1000");
                }

            //Usuario Pedro

            } else if (nome.equals("Pedro") && senha == 260914) {
                IO.println("Bem vindo usuario Pedro");
                IO.println("Nascimento: 26/09/14");
                IO.println("Agencia: ########");
                IO.println("Oque voçê deseja fazer?: ");
                IO.println("1.Saldo");
                IO.println("2.Transferencia");
                IO.println("3.Cancelar a conta");
                IO.println("4.Consultar o extrato");
                IO.println("5.Consultar saldo atual");
                String opcao = IO.readln();

                if (opcao.equals("1")) {
                    IO.println("Quanto deseja sacar?: ");
               
                } else if (opcao.equals("2")) {
                    IO.println("Para qual conta deseja transferir?: ");
                    String transferencia = IO.readln();
                    int valor = 0;

                    if (transferencia.equals("Pedro")) {
                        valor = Integer.parseInt(IO.readln("Digite o valor da transferencia: "));
                    }else {
                        System.exit(0);
                    }
                    if (valor > 1000 || valor <= 0) {
                        IO.println("Não a como transferir esse valor");
                    }else if (valor <= 1000 && valor > 0 ){
                        IO.println("O valor foi transferido");
                    }
                    
                } else if (opcao.equals("3")) {
                    IO.println("Porque deseja cancelar a conta?: ");
               
                } else if (opcao.equals("4")) {
                    IO.println("Para qual conta deseja transferir?: ");
                
                } else if (opcao.equals("5")) {
                    IO.println("Seu saldo atual é de R$500");
                }


            }


        }
    }




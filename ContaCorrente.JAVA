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
            IO.println("6.Encerrar programa");
            String opcao = IO.readln();
            int valor = 0;
            int sacar = 0;
            int saldo = 1000;

            if (opcao.equals("1")) {
                sacar = Integer.parseInt(IO.readln("Quanto deseja sacar?: "));

                if (sacar <= saldo && sacar > 0) {
                    IO.println("O valor de R$" + sacar + "foi revertido em nota");
                }else{
                    IO.println("Esse valor não é possivel de sacar");
                }


            } else if (opcao.equals("2")) {
                IO.println("Para qual conta deseja transferir?: ");
                String transferencia = IO.readln();

                if (transferencia.equals("Pedro")) {
                    valor = Integer.parseInt(IO.readln("Digite o valor da transferencia: "));
                }else {
                    System.exit(0);
                }
                if (valor > 1000 || valor <= 0) {
                    IO.println("Não a como transferir esse valor");
                }else{
                    IO.println("O valor de " + "R$" + valor + " foi transferido para " + transferencia);
                }

            } else if (opcao.equals("3")) {
                    String contexto = IO.readln("Por que deseja cancelar a conta?: ");
                    IO.println("entendo...");
                    IO.println("Motivo: " + contexto);
                    IO.println("Conta encerrada");

            } else if (opcao.equals("4")) {
                IO.println(": ");

            }else if (opcao.equals("5")) {
                saldo = saldo - valor;
                saldo = saldo - sacar;
                IO.println("Seu saldo atual é de R$" + saldo);

            }else if (opcao.equals("6")) {
                IO.println("Programa encerrado...");
                System.exit(0);
            }else{
                IO.println("Opção não existente!!!");

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
                IO.println("6.Encerrar programa");
                String opcao = IO.readln();
                 int valor = 0;
                 int sacar = 0;
                int saldo = 500;

                 if (opcao.equals("1")) {
                     sacar = Integer.parseInt(IO.readln("Quanto deseja sacar?: "));

                    if (sacar <= saldo && sacar > 0) {
                        IO.println("O valor de R$" + sacar + "foi revertido em nota");
                    }else{
                        IO.println("Esse valor não é possivel de sacar");
                    }


                } else if (opcao.equals("2")) {
                    IO.println("Para qual conta deseja transferir?: ");
                    String transferencia = IO.readln();

                    if (transferencia.equals("Augusto")) {
                        valor = Integer.parseInt(IO.readln("Digite o valor da transferencia: "));
                    }else {
                        System.exit(0);
                    }
                    if (valor > 0 || valor <= 0) {
                        IO.println("Não a como transferir esse valor");
                    }else{
                        IO.println("O valor de " + "R$" + valor + " foi transferido para " + transferencia);

                    }

                } else if (opcao.equals("3")) {
                    String contexto = IO.readln("Por que deseja cancelar a conta?: ");
                    IO.println("entendo...");
                    IO.println("Motivo: " + contexto);
                    IO.println("Conta encerrada");

                } else if (opcao.equals("4")) {
                    IO.println(": ");

                } else if (opcao.equals("5")) {
                     saldo = saldo - valor;
                     saldo = saldo - sacar;
                     IO.println("Seu saldo atual é de R$" + saldo);

                }else if (opcao.equals("6")) {
                     IO.println("Programa encerrado...");
                     System.exit(0);
                 }


            }






        }
    }


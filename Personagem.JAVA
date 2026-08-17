public class Personagem {

private String nome;
private int vida;
private  int energia;
private int nivel;
private int danoAtacar;


public Personagem(String nome) {

this.nome = nome;
this.vida = 100;
this.energia = 100;
this.nivel = 1;
this.danoAtacar = 40;

}


public String getStatus() {

if (vida >= 1) {
    return(nome + " está vivo");
}else{
    return(nome + " está morto");
}

}


public void status() {

    IO.println("");
    IO.println("");
    IO.println("|=================|");
    IO.println("|   vida = " + vida + "     |");
    IO.println("|  energia = " + energia + "   |");
    IO.println("|   nivel = " + nivel + "     |");
    IO.println("|=================|");
    IO.println("");
    IO.println("");
}


public void receberDano(int dano) {
  vida -= dano;

    if (vida < 0) {
        vida = 0;
    }
        IO.println(nome + " recebeu " + dano + " de dano |vida - " + dano + "|");

}


public void descansar() {
   energia += 40;
   vida += 20;

    if (energia > 100) {
       energia = 100;
        IO.println(nome + " descansou |energia + 40|");

    }else if (vida <= 0) {
        IO.println(nome + " esta morto...");
      System.exit(0);
    }


}


public void atacar() {
    if (energia >= 20 && vida > 0) {
      energia -= 20;
      IO.println(nome + " atacou |energia - 20|");
      IO.println("Monstro recebeu " + danoAtacar + " de dano");

    }else if (energia <= 0){
      IO.println(nome + " não tem energia o suficiente para atacar...");

  }else if (vida <= 0) {
        IO.println(nome + " esta morto...");
      System.exit(0);
    }
}


public void sair() {
    IO.println("Saindo do jogo");
    System.exit(0);
}


public void derrotarMonstro() {
    if (vida > 0 && energia > 0) {
        nivel += 1;
        IO.println(nome + " derrotou Monstro");
        IO.println(nome + " subiu de nivel");

    } else if (energia <= 0) {
     IO.println(nome + " fugiu");

    }else if (vida <= 0){
        IO.println(nome + " esta morto...");
     System.exit(0);
    }
}


    public static void main (String[]args){

        String escolha;

        String nome = IO.readln("Digite o nome do seu personagem: ");
        Personagem personagem = new Personagem(nome);
        IO.println("Personagem " + nome + " criado");

        while (true) {
            IO.println("(_______________________)");
            IO.println(" |                     |");
            IO.println(" |  Menu de Personagem |");
            IO.println(" |                     |");
            IO.println(" |   1.Informaçoes     |");
            IO.println(" |      2.Status       |");
            IO.println(" | 3.Enfrentar monstro |");
            IO.println(" |     4.Descansar     |");
            IO.println(" |       5.Sair        |");
            IO.println(" |                     |");
            IO.println("(_______________________)");

            escolha = IO.readln("Digite a opção desejada: ");


            if (escolha.equals("1")) {
                personagem.status();

            } else if (escolha.equals("2")) {
                IO.println(personagem.getStatus());

            } else if (escolha.equals("3")) {
                IO.println("!!!Monstro selvagem apareceu!!!");
                IO.println(" Atacar - Fugir ");
                escolha = IO.readln("Escolha: ");

                if (escolha.equals("atacar")) {
                    personagem.atacar();
                    IO.println("monstro ataca");
                    personagem.receberDano(25);
                    IO.println(" Atacar - Fugir ");
                    escolha = IO.readln("Escolha: ");

                    if (escolha.equals("atacar")) {
                        personagem.atacar();
                        personagem.derrotarMonstro();

                    } else if (escolha.equals("fugir")) {
                        IO.println(nome + " fugiu");
                    }


                } else if (escolha.equals("fugir")) {
                    IO.println(nome + " fugiu");
                }


            } else if (escolha.equals("4")) {
                personagem.descansar();


            } else if (escolha.equals("5")) {
                personagem.sair();
            }

        }
    }

}

 public class BichinhoVirtual {
 private String nome;
 private int fome;
 private int estamina;
 private int humor;
 private String escolha;

 public BichinhoVirtual(String nome) {
  this.nome = nome;
  this.fome = 20;
  this.estamina = 80;
  this.humor = 50;
  this.escolha = escolha;
 }

 public void alimentar() {

  if (fome > 0) {
   fome -= 20;
   if (fome < 0) fome = 0;
   IO.println(nome + " Comeu e esta de barriguinha cheia (Fome: " + fome);
  } else {
   IO.println(nome + " Esta de barriguinha cheia e não quer comer (Fome: " + fome);
  }
 }

 public void brincar() {
  if (estamina >= 20) {
   fome += 15;
   estamina -= 20;
   humor += 30;
   IO.println(nome + " Se divertiu brincando! (estamina: " + estamina);
  } else {
   IO.println(nome + " Esta sem energia para brincar... (estamina: " + estamina);
  }
 }

 public void carinho() {
  if (humor <= 40) {
   fome += 40;
   estamina += 30;
   humor -= 40;
   IO.println(nome + "esta de bom humor (humor: " + humor);
  } else {
   IO.println(nome + "esta de mau humor (humor: " + humor);
  }
 }

 public void mostrarStatus() {
  IO.println("\n---STATUS DE " + nome.toUpperCase() + "---");
  IO.println("Fome: " + fome + "/100");
  IO.println("Estamina: " + estamina + "/100");
  IO.println("Humor: " + humor + "/100");
  IO.println("-------------------------");
 }

 public static void main(String []args) {

  String nomeDoBicho = IO.readln("De um nome ao bicho: ");
  IO.println("Seu bicho foi nomeado como " + nomeDoBicho);
  BichinhoVirtual bicho = new BichinhoVirtual(nomeDoBicho);

  IO.println("Seu bicho virtual:");
  IO.println("");
  IO.println(" __      __");
  IO.println("|  |____|  |");
  IO.println("|   _   _  |");
  IO.println("|  | | | | |");
  IO.println("|  --- --- |");
  IO.println("|__________|");
  IO.println("   |_| |_|  ");
  IO.println("Oque vc quer fazer com o/a " + nomeDoBicho);
  IO.println("1.Alimenta-lo  2.Fazer carinho  3.Brincar");

  String escolha = "";
  while (!escolha.equals("4")) {
   bicho.mostrarStatus();

   IO.println("O que vc quer fazer com o/a " + nomeDoBicho + "?");
   IO.println("1. Alimenta-lo");
   IO.println("2. Brincar");
   IO.println("3. Fazer carinho");
   IO.println("4. Sair");
   escolha = IO.readln("Resposta: ");

   if (escolha.equals("1")) {
    bicho.alimentar();
   } else if (escolha.equals("2")) {
    bicho.brincar();
   } else if (escolha.equals("3")) {
    bicho.carinho();
   } else if (escolha.equals("4")) {
    IO.println("Tchau! Até a próxima.");
   } else {
    IO.println("Opção inválida! Escolha 1, 2, 3 ou 4.");
   }
  }
 }
}

// PARTE MAIN 

public static void main(String[] args) {

  String nomeDoBicho = IO.readln("De um nome ao bicho: ");
  IO.println("Seu bicho foi nomeado como " + nomeDoBicho);

  BichinhoVirtual bicho = new BichinhoVirtual(nomeDoBicho);

  IO.println("");
  IO.println(" __      __");
  IO.println("|  |____|  |");
  IO.println("|   _   _  |");
  IO.println("|  | | | | |");
  IO.println("|  --- --- |");
  IO.println("|__________|");
  IO.println("   |_| |_|  ");

  String escolha = "";
  while (!escolha.equals("4")) {
    bicho.mostrarStatus();

    IO.println("O que vc quer fazer com o/a " + nomeDoBicho + "?");
    IO.println("1. Alimenta-lo  2. Fazer carinho  3. Brincar  4. Sair");

    escolha = IO.readln("Resposta: ");

    if (escolha.equals("1")) {
      bicho.alimentar();
    } else if (escolha.equals("2")) {
      bicho.carinho();
    } else if (escolha.equals("3")) {
      bicho.brincar();
    } else if (escolha.equals("4")) {
      IO.println("Tchau! Até a próxima.");
    } else {
      IO.println("Opção inválida! Digite de 1 a 4.");
    }
  }
}

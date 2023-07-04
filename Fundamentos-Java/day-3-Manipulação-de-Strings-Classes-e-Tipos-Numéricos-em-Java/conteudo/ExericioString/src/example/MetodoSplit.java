package example;

public class MetodoSplit {

  public void printValueCaracterIgual(String texto, String valueSplit, int limitador) {
    String value[] = texto.split(valueSplit, limitador);

    for (String textos : value) {
      System.out.println(textos);
    }
  }

  public void printValueCaracterDiferente(String texto) {
    String value[] = texto.split("\\d+");

    for (String textos : value) {
      System.out.println(textos);
    }
  }


  public static void main(String[] args) {
    MetodoSplit print = new MetodoSplit();
    print.printValueCaracterIgual("Grifinória;Sonseria;Corvinal;Lufa-Lufa", ";", 0);
    print.printValueCaracterDiferente("Grifinória123Sonseria456Corvinal789Lufa-Lufa");
    print.printValueCaracterIgual("caneta,lápis,lapiseira,caderno,borracha", ",", 3);

  }

}

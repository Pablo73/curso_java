package example;

public class IndexOf {

  public int getIndexOf(String frase, String caracter, int positionInit) {
    return frase.indexOf(caracter, positionInit);
  }

  public String moedaPorExtenco(String valor, String separador) {
    int numberSeparador = valor.indexOf(separador);
    double total = getTotal(valor, numberSeparador - 1);
    String moeda = getMoeda(valor, numberSeparador + 1);

    if (moeda.equals("CAD")) {
      return total + " dólares canadenses";
    }
    return "Moeda não reconhecida";
  }

  private double getTotal(String valor, int endIndex) {
    String totalStr = valor.substring(0, endIndex + 1);
    return Double.parseDouble(totalStr);
  }

  private String getMoeda(String valor, int startIndex) {
    return valor.substring(startIndex);
  }

  public static void main(String[] args) {
    IndexOf numberCaracter = new IndexOf();
    System.out.println(numberCaracter.getIndexOf("Olá, Mundo!", "M", 0));
    System.out.println(numberCaracter.getIndexOf("Lorem ipsum dolor sit amet", "s", 10));
    System.out.println(numberCaracter.moedaPorExtenco("123.45MCAD", "M"));

  }

}

package example;

public class ObjetosString {

  public static void main(String[] args) {
    String numeros = "09890";
    String caractere = "a";
    String frase1 = "Estou aprendendo Java %s %s minutos!";
    System.out.printf(frase1, caractere, numeros);

    String eu = "Eu";
    String ja = " já";
    String sei = " sei";
    String usar = " usar";
    String strings = " Strings";
    String em = " em";
    String java = " Java";

    String frase2 = eu + ja + sei + usar + strings + em + java;
    System.out.println(frase2); // Eu já sei usar Strings em Java

    StringBuilder stringBuilder = new StringBuilder();

    String frase = stringBuilder.append(eu)
            .append(ja)
            .append(sei)
            .append(usar)
            .append(strings)
            .append(em)
            .append(java)
            .toString();
    System.out.println(frase); // Eu já sei usar Strings em Java
  }

}

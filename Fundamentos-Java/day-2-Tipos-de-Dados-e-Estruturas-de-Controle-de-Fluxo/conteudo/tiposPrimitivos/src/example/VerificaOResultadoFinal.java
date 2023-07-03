package example;

public class VerificaOResultadoFinal {

  public static void main(String[] args) {
    double mediaFinal = 7.5;
    String resultado = "INDEFINIDO";

    if (mediaFinal >= 7) {
      resultado = "APROVADO";
    } else {
      resultado = "REPROVADO";
    }

  }

}

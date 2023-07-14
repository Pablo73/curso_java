package example;

public class ModificadoresDeAcesso {
  public int numeroDePagians;

  ModificadoresDeAcesso(int numeroDePagians) {
    this.numeroDePagians = numeroDePagians;
  }

  public int retornarNumeroDePaginas() {
    return numeroDePagians;
  }

  public static void main(String[] args) {
    ModificadoresDeAcesso modificadoresDeAcesso = new ModificadoresDeAcesso(565);
    int paginas = modificadoresDeAcesso.retornarNumeroDePaginas();
    System.out.println(paginas);

  }

}

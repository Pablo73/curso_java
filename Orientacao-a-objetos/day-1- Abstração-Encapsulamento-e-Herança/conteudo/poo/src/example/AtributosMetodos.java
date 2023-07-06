package example;

public class AtributosMetodos {
  String titulo;
  int numeroDePaginas;
  String isbn;

  AtributosMetodos(int paginas) {
    this.numeroDePaginas = paginas;
  }

  public int retornarNumeroDePaginas() {
    return numeroDePaginas;
  }

  void mutiplicar() {
    int resultado = 10 * 50;
    System.out.println(resultado);
  }

  public static void main(String[] args) {
    AtributosMetodos atributosMetodos = new AtributosMetodos(202);
    int numeroDePagina = atributosMetodos.retornarNumeroDePaginas();
    atributosMetodos.mutiplicar();
    System.out.println("O numero de pagina do livro e " + numeroDePagina);
  }

}

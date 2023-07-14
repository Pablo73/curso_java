package example;

public class StringFormatar {
  private String contaFormatada;

  public StringFormatar(String contaFormatada) {
    this.contaFormatada = contaFormatada;
  }

  public String getNumeralConta() {
    return this.contaFormatada.replace('X', '0');
  }

  public String substituiNome(String nome, String nomes) {
    return nomes.replace(nome, this.contaFormatada);

    // outra forma replaceAll(String regex, String replacement) e replaceFirst
  }

  public static void main(String[] args) {
    StringFormatar stringFormatar = new StringFormatar("152588-X");
    StringFormatar substitui = new StringFormatar("Laura");

    System.out.println(stringFormatar.getNumeralConta());
    System.out.println(
        substitui.substituiNome("Magali", "Maria Magali, Magali da Silva, Magali Medeiros"));
  }

}


// No replaceAll, devemos ter uma expressão regular como primeiro parâmetro, podendo assim
// substituir para nomes.replaceAll("\\S+!", pessoa); e obter o mesmo resultado. Ao fazermos isso,
// qualquer texto que estiver antes da exclamação será substituído.

// O replaceFirst serve para substituir apenas a primeira ocorrência da expressão regular.

// O método replace serve para substituir caracteres ou textos de uma determinada String por outro
// caractere ou texto.

package example;

public class GettersCaro {
  private String nome;
  private String montadora;
  private int ano;

  public GettersCaro(String nomeCarro, String montadoraCarro, int anoCarro) {
    nome = nomeCarro;
    montadora = montadoraCarro;
    ano = anoCarro;
  }

  public String getMontadora() {
    return montadora;
  }

  public int getAno() {
    return ano;
  }

  String getNome() {
    return this.nome;
  }

  public static void main(String[] args) {
    GettersCaro gettersCaro = new GettersCaro("Creta", "Hyundai", 2021);

    System.out.println("O nome do carro é: " + gettersCaro.getNome());
    System.out.println("A montadora do carro é: " + gettersCaro.getMontadora());
    System.out.println("O ano do carro é: " + gettersCaro.getAno());

  }

}

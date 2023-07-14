package example.estudoHeranca;

public class HerancaCarro extends HeracaVeiculo {
  public boolean statusOperacional;

  public HerancaCarro(boolean statusOperacional) {
    super.placa = placa;
    super.motorista = motorista;
    super.cor = cor;
    this.statusOperacional = statusOperacional;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}

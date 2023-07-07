package polimorfismoSobrescrita;

public class Main {

  public static void main(String[] args) {
    PolimorfismoCarro polimorfismoCarro = new PolimorfismoCarro();
    polimorfismoCarro.abastecer();
    polimorfismoCarro.acelerar();

    PolimorfismoMoto polimorfismoMoto = new PolimorfismoMoto();
    polimorfismoMoto.abastecer();
    polimorfismoMoto.acelerar();

  }

}

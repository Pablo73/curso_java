package modificadorAcessoDefaultProtected;

public class PortaSegura extends Porta {

  private String chave;
  private boolean estaTrancada;

  public PortaSegura(String chave) {
    super();
    this.chave = chave;
    this.estaTrancada = false;
  }

  public void trancar(String chave) {
    if (this.estaTrancada) {
      System.out.println("PortaSegura já está trancada");
    } else {
      if (this.estaAberta) {
        super.fechar();
      }

      this.estaTrancada = true;
      System.out.println("PortaSegura foi trancada");
    }
  }

  public PortaSegura() {
    // TODO Auto-generated constructor stub
  }

}

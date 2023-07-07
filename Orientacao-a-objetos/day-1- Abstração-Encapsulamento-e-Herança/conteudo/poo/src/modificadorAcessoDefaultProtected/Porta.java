package modificadorAcessoDefaultProtected;

public class Porta {
  private int tamanho;
  private String material;
  protected boolean estaAberta;

  public Porta() {
    this.estaAberta = false;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public void setMaterial(String material) {
    this.material = material;
  }


  public int getTamanho() {
    return tamanho;
  }

  public String getMaterial() {
    return material;
  }

  public void abrir() {
    if (estaAberta) {
      System.out.println("Porta já estava aberta");
    } else {
      estaAberta = true;
      System.out.println("Porta foi aberta");
    }
  }

  public void fechar() {
    if (!estaAberta) {
      System.out.println("Porta já estava chechada");
    } else {
      estaAberta = false;
      System.out.println("Porta foi fechada");
    }
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}

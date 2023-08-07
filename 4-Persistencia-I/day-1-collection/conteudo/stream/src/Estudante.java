public class Estudante {
  private String matricula;

  private String nome;

  private String curso;

  public Estudante() {
  }

  public Estudante(String matricula, String nome, String curso) {
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public String getCurso() {
    return curso;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }
}

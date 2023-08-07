import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Collection<Estudante> entrada = CodeExamples.obterEntrada();
    List<String> matriculas = entrada.stream()
        .filter(e -> "Computação".equals(e.getCurso()))
        .sorted(Comparator.comparing(Estudante::getNome))
        .map(Estudante::getMatricula)
        .collect(Collectors.toList());
    System.out.println(matriculas);
    System.out.println(matriculas.contains("2001"));

    Collection<String> nomes = List.of("Fulano","Maria","Fulano","José","José","Joana");
    long pessoasDistintas = nomes.stream()
        .distinct()
        .count();
    System.out.println(pessoasDistintas);

    Estudante estudanteDeNomeMario = entrada.stream()
        .filter(e -> "Mário".equals(e.getNome()))
        .findAny()
        .orElse(null);
    System.out.println(estudanteDeNomeMario);
  }
}
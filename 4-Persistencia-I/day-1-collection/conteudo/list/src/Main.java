import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

//  public static void main(String[] args) {
//    List<Integer> numeros = new ArrayList<Integer>();
//    numeros.add(7);
//    numeros.add(2);
//    numeros.add(1);
//    numeros.add(9);
//    System.out.println(numeros);
//    Collections.sort(numeros);
//    System.out.println(numeros);
//    numeros.add(3);
//    System.out.println(numeros);
//  }

//  public static void main(String[] args){
//    List<String> estudantes = Arrays.asList("João","Maria","Pedro","Rosa");
//    List<String> estudantes = Arrays.asList(new String[]{"João","Maria","Pedro","Rosa"});
//    String[]arrayDeEstudantes = new String[]{"João","Maria","Pedro","Rosa"};
//    List<String> estudantes = Arrays.asList(arrayDeEstudantes);
//    System.out.println(estudantes);
//  }

//  public static void main(String[] args){
//    List<String> estudantes = List.of("João","Maria","Pedro","Rosa");// Imutável não é possível alterar os dados
//    String estudanteDoIndice2 = estudantes.get(2);
//    System.out.println(estudanteDoIndice2);
//  }

//  public static void main(String[] args){
//    List<String> estudantes = Arrays.asList("João","Maria","Pedro","Rosa");// Já desta forma o array é fixo, mas é possível alterar os valores.
//    estudantes.set(0,"Joana");
//    System.out.println(estudantes);
//  }

//  public static void main(String[] args){
//    ArrayList<String> estudantes = new ArrayList<String>(Arrays.asList("João","Maria","Pedro","Rosa"));
//    estudantes.remove(1);
//    System.out.println(estudantes);
//    estudantes.remove("Pedro");
//    System.out.println(estudantes);
//  }

//  public static void main(String[] args){
//    List<String> estudantes = Arrays.asList("João","Maria","Pedro","Rosa");
//    System.out.println(estudantes.size());//Verifica o tamanho da lista. Return 4
//  }

  public static void main(String[] args){
    List<String> estudantes = Arrays.asList("João","Maria","Pedro","Rosa");
    System.out.println(estudantes.contains("João"));//Return True
  }

}
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

//  public static void main(String[] args){
//    TreeSet<Integer> numeros = new TreeSet<Integer>();
//    numeros.add(7);
//    numeros.add(2);
//    numeros.add(7);
//    numeros.add(9);
//    System.out.println(numeros);
//
//  }

//  public static void main(String[] args){
//    HashSet<String> estudantes = new HashSet<>();
//    boolean adicionouJoao = estudantes.add("João");
//    boolean adicionouJoaoDeNovo = estudantes.add("João");
//    boolean adicionouMaria = estudantes.add("Maria");
//    System.out.println(String.format("adicionouJoao: %b",adicionouJoao));
//    System.out.println(String.format("adicionouJoaoDeNovo: %b",adicionouJoaoDeNovo));
//    System.out.println(String.format("adicionouMaria: %b",adicionouMaria));
//  }

//  public static void main(String[] args){
//    HashSet<String> estudantes = new HashSet<>();
//    estudantes.add("João");
//    estudantes.add("Maria");
//    System.out.println(estudantes);
//    estudantes.remove("João");
//    System.out.println(estudantes);
//  }

//  public static void main(String[] args){
//    HashSet<String> estudantes = new HashSet<>();
//    estudantes.add("João");
//    estudantes.add("Maria");
//    System.out.println(estudantes.size());//return 2
//  }

  public static void main(String[] args){
    HashSet<String> estudantes = new HashSet<>();
    estudantes.add("João");
    estudantes.add("Maria");
    System.out.println(estudantes.contains("Maria"));//return true
  }
}
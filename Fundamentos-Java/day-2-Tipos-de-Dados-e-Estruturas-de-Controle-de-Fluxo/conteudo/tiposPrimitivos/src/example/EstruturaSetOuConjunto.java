package example;

import java.util.HashSet;
import java.util.Set;

public class EstruturaSetOuConjunto {

  public static void main(String[] args) {
    // Criação de um conjunto usando a classe HashSet
    Set<String> conjunto = new HashSet<>();

    // Adicionar elementos ao conjunto
    conjunto.add("elemento1");
    conjunto.add("elemento2");
    conjunto.add("elemento3");

    // Verificar se um elemento existe no conjunto
    boolean existeElemento = conjunto.contains("elemento1");
    System.out.println("Existe elemento1? " + existeElemento);

    // Remover um elemento do conjunto
    conjunto.remove("elemento2");

    // Iterar sobre os elementos do conjunto
    for (String elemento : conjunto) {
      System.out.println(elemento);
    }

  }

}

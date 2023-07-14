package example;

public class TiposPrimitivos {

  public static void main(String[] args) {
    byte b = 9;
    short num = 300;
    short formatadaComUnderscore = 20_000; // variable
    int numeroInteiro = 10;
    int a = 10, c = 20, soma; // inicialização de variáveis inline
    soma = a + c; // atribuição da soma da variável a + b para a variável soma
    long numA = 102040;
    long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor
                               // do tipo long
    float numC = -101.23f;
    float numD = 2.356f;
    double d = 2.356; // double inicializado naturalmente
    double e = 1.409F; // double aceitando número float
    double f = 12930L; // double aceitando número long
    boolean isBoolean = true; // outros exemplos: isGreaterThan, isFlexible, isStarted
    boolean isNumber = false; // outros exemplos: ehMaiorDeIdade, ehCedo, ehValido
    char letraA = 'a'; // Aspas simples significa carácter, aspas duplas significa string
    char letraAMaiuscula = 'A';

    System.out.println(b);
    System.out.println(num);
    System.out.println(formatadaComUnderscore);
    System.out.println(numeroInteiro); // 10
    System.out.println(soma); // 30
    System.out.println(numA);
    System.out.println(numB);
    System.out.println(numC + numD); // -98.874
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(letraA); // a
    System.out.println(letraAMaiuscula); // A
  }

}

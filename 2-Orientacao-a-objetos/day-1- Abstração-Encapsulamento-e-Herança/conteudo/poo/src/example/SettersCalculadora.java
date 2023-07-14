package example;

import java.util.Scanner;

public class SettersCalculadora {

  private int primeiroNumero;
  private int segundoNumero;

  public int somar() {
    int resultado = primeiroNumero + segundoNumero;
    return resultado;
  }

  public int subtrair() {
    int resultado = primeiroNumero - segundoNumero;
    return resultado;
  }

  public int multiplicar() {
    int resultado = primeiroNumero * segundoNumero;
    return resultado;
  }

  public void setPrimeiroNumero(int primeiroNumero) {
    this.primeiroNumero = primeiroNumero;
  }

  public void setSegundoNumero(int segundoNumero) {
    this.segundoNumero = segundoNumero;
  }

  public int dividir() {
    int resultado = primeiroNumero / segundoNumero;
    return resultado;
  }

  public void interfaceUser() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calculador Java");
    System.out.println("Por favor digite o codigo da operação");
    System.out.println("1 - somar");
    System.out.println("2 - subtrair");
    System.out.println("3 - multiplicar");
    System.out.println("4 - dividir");

    String inputOperacao = scanner.next();

    System.out.println("digite o primeiro numero");
    String inputNumber1 = scanner.next();

    System.out.println("digite o segundo numero");
    String inputNumber2 = scanner.next();

    scanner.close();

    int number1 = Short.parseShort(inputNumber1);
    int number2 = Short.parseShort(inputNumber2);

    this.primeiroNumero = number1;
    this.segundoNumero = number2;


    switch (inputOperacao) {
      case "1":
        int valueSoma = somar();
        System.out.println(
            "o resultaod de " + primeiroNumero + " + " + segundoNumero + " = " + valueSoma);
        break;
      case "2":
        int valueSubtrair = subtrair();
        System.out.println(
            "o resultaod de " + primeiroNumero + " - " + segundoNumero + " = " + valueSubtrair);
        break;
      case "3":
        int valueMultiplicar = multiplicar();
        System.out.println(
            "o resultaod de " + primeiroNumero + " x " + segundoNumero + " = " + valueMultiplicar);
        break;
      case "4":
        int valueDividir = dividir();
        System.out.println(
            "o resultaod de " + primeiroNumero + " / " + segundoNumero + " = " + valueDividir);
        break;
      default:
        System.out.println("Opção Inválida.");

    }

  }

  public int getPrimeiroNumero() {
    return primeiroNumero;
  }

  public int getSegundoNumero() {
    return segundoNumero;
  }

  public static void main(String[] args) {
    SettersCalculadora settersCalculadora = new SettersCalculadora();
    settersCalculadora.interfaceUser();
    int valor1 = settersCalculadora.getPrimeiroNumero();
    System.out.println(valor1);
    settersCalculadora.setPrimeiroNumero(50);
    System.out.println(settersCalculadora.somar());

  }

}

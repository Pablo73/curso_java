package metodosAbstratasClasses;

public class Main {

  public static void main(String[] args) {
    JuniorDeveloper juniorDeveloper = new JuniorDeveloper("Java", 2);
    System.out.println(juniorDeveloper.mainSkill());
    System.out.println(juniorDeveloper.wage());

    SeniorDeveloper seniorDeveloper = new SeniorDeveloper("Java", 2);
    System.out.println(seniorDeveloper.mainSkill());
    System.out.println(seniorDeveloper.wage());

    AbstrataDeveloper abstrataDeveloper = new AbstrataDeveloper("Python", 1) {

      public double wage() {
        return 4000.0;
      }

      public String mainSkill() {
        return "Debug";
      }
    };
    System.out.println(
        abstrataDeveloper.language + " experiencia de " + abstrataDeveloper.yearsOfExperience
            + " anos " + "salario de R$" + abstrataDeveloper.wage());
  }

}

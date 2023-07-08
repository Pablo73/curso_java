package metodosAbstratasClasses;

public class SeniorDeveloper extends AbstrataDeveloper {

  SeniorDeveloper(String language, int yearsOfExperience) {
    super(language, yearsOfExperience);
  }

  public double wage() {
    return 5000.0 + yearsOfExperience * 500;
  }

  public String mainSkill() {
    return language + " Debug";
  }

}

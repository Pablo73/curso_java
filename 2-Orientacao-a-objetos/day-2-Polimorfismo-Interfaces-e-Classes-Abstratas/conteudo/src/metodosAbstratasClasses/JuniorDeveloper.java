package metodosAbstratasClasses;

public class JuniorDeveloper extends AbstrataDeveloper {

  JuniorDeveloper(String language, int yearsOfExperience) {
    super(language, yearsOfExperience);
  }

  public double wage() {
    return 3000.0 + yearsOfExperience * 100;
  }

  public String mainSkill() {
    return language + " Automated tests";
  }

}

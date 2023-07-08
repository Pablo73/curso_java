package metodosAbstratasClasses;

public abstract class AbstrataDeveloper implements Skillful {
  public String language;
  public int yearsOfExperience;

  public AbstrataDeveloper(String language, int yearsOfExperience) {
    this.language = language;
    this.yearsOfExperience = yearsOfExperience;
  }

  public abstract double wage();

}

package solution;

public class Person {

  private int id;
  private Name name;
  private Email email;


  public Person(int id, Name name, Email email) {

    if (name == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }

    if (email == null) {
      throw new IllegalArgumentException("Email cannot be null");
    }

    this.id = id;
    this.name = name;
    this.email = email;
  }


  public void setName(Name name) {
    if (name == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }

    this.name = name;
  }

  public void setEmail(Email email) {
    if (email == null) {
      throw new IllegalArgumentException("Email cannot be null");
    }

    this.email = email;
  }
}

package problem;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Person {

  private int id;
  private String name;
  private String email;


  public Person(int id, String name, String email) {

    if (StringUtils.isEmpty(name)) {
      throw new IllegalArgumentException("Name cannot be empty");
    }
    if (name.length() > 50) {
      throw new IllegalArgumentException("Name should be shorter than 50 chars");
    }

    if (StringUtils.isEmpty(email)) {
      throw new IllegalArgumentException("Email cannot be empty");
    }
    if (email.length() > 80) {
      throw new IllegalArgumentException("Email should be shorter than 80 chars");
    }

    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    if (!pattern.matcher(email).matches()) {
      throw new IllegalArgumentException("Email is invalid");
    }

    this.id = id;
    this.name = name;
    this.email = email;
  }


  public void setName(String name) {
    if (StringUtils.isEmpty(name)) {
      throw new IllegalArgumentException("Name cannot be empty");
    }
    if (name.length() > 50) {
      throw new IllegalArgumentException("Name should be shorter than 50 chars");
    }

    this.name = name;
  }

  public void setEmail(String email) {
    if (StringUtils.isEmpty(email)) {
      throw new IllegalArgumentException("Email address cannot be empty");
    }
    if (email.length() > 80) {
      throw new IllegalArgumentException("Email should be shorter than 80 chars");
    }

    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    if (!pattern.matcher(email).matches()) {
      throw new IllegalArgumentException("Email is invalid");
    }

    this.email = email;
  }

}

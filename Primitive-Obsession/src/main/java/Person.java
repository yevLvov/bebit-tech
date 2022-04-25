import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Person {

  private int id;
  private String name;
  private String emailAddress;

//  ...

  public Person(int id, String name, String emailAddress) {

    if (StringUtils.isEmpty(name) || name.length() > 50) {
      throw new IllegalArgumentException("Name is invalid");
    }

    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    if (StringUtils.isEmpty(emailAddress) || !pattern.matcher(emailAddress).matches() || emailAddress.length() > 80) {
      throw new IllegalArgumentException("Email address is invalid");
    }

    this.id = id;
    this.name = name;
    this.emailAddress = emailAddress;
  }


  public void setName(String name) {
    if (StringUtils.isEmpty(name) || name.length() > 50) {
      throw new IllegalArgumentException("Name is invalid");
    }

    this.name = name;
  }

  public void setEmailAddress(String emailAddress) {
    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    if (StringUtils.isEmpty(emailAddress) || !pattern.matcher(emailAddress).matches() || emailAddress.length() > 80) {
      throw new IllegalArgumentException("Email address is invalid");
    }

    this.emailAddress = emailAddress;
  }

}

package solution;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Email {

  private String email;


  public Email(String email) {
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

    this.email = email;
  }

}

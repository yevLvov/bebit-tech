package solution;

import org.apache.commons.lang3.StringUtils;

public class Name {

  private String name;


  public Name(String name) {
    if (StringUtils.isEmpty(name)) {
      throw new IllegalArgumentException("Name cannot be empty");
    }
    if (name.length() > 50) {
      throw new IllegalArgumentException("Name should be shorter than 50 chars");
    }

    this.name = name;
  }
}

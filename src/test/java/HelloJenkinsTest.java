import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloJenkinsTest {

  @Test
  public void printMessageShouldPrintMessage() {
    HelloJenkins helloJenkins = new HelloJenkins();

    String result = helloJenkins.printMessage("Java");

    assertEquals("Hello Java", result);
  }
}

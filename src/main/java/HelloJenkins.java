public class HelloJenkins {
  public static void main(String[] args) {
    HelloJenkins helloJenkins = new HelloJenkins();
    helloJenkins.printMessage("Jenkins");
  }

  public String printMessage(String msg) {
    String completeMessage = "Hello " + msg;
    System.out.println(completeMessage);
    return completeMessage;
  }
}

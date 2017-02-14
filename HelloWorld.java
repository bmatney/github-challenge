/* Today I started the Java Basics program on Team TreeHouse and learned about
the basics of declaring variables, using the console, and compiling in Java */

import java.io.Console;

public class HelloWorld {

  public static void main(String[] args){
    Console console = System.console();
    String name = console.readLine("");
    String language = console.readLine("");
    String operatingSystem = console.readLine("");
    console.printf("%s is learning %s for %s\n", name, language, operatingSystem);
  }
}

/* Today I started the Java Basics program on Team TreeHouse and learned about
the basics of declaring variables, using the console, and compiling in Java */

import java.io.Console;

public class HelloWorld {

  public static void main(String[] args){
    Console console = System.console();
    String name = console.readLine("Enter your name:  ");
    String language = console.readLine("Pick a coding language:  ");
    String operatingSystem = console.readLine("Pick an operating system:  ");
    console.printf("%s is learning %s for %s\n", name, language, operatingSystem);

    String answer;

    do{
      answer = console.readLine("Does this make sense yet?  ");
    }while(answer.equalsIgnoreCase("no"));
      console.printf("Do it again!");
  }
}

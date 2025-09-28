package chess;

import java.util.Scanner;

/**
 * The chess game application.
 */
public class Main {

  /**
   * Takes in user commands for chess game.
   *
   * @param args arguments run with application
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String command = sc.nextLine();

    while(!command.equals("exit")) {
      System.out.printf("Chess is gonna be %s tonight honey", command);
      command = sc.nextLine();
    }

  }
}
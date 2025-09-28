package chess;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String command = sc.nextLine();

    while(!command.equals("exit")) {
      System.out.printf("Chess is gonna be %s tonight honey", command);
      command = sc.nextLine();
    }

  }
}
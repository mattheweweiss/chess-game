import chess.ChessBoard;
import chess.ChessBoardImpl;
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

    ChessBoard board = new ChessBoardImpl();
    board.buildBoard();
    System.out.println(board.visualizeBoard());

    Scanner sc = new Scanner(System.in);
    String command = sc.nextLine();

    while(!command.equals("exit")) {
      System.out.printf("Chess is gonna be %s tonight honey", command);
      command = sc.nextLine();
    }

  }
}
import chess.controller.GameController;
import chess.controller.GameControllerImpl;
import chess.model.Game;
import chess.model.GameImpl;

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
    Game game = new GameImpl();
    GameController controller = new GameControllerImpl(game);
    controller.run();
  }
}
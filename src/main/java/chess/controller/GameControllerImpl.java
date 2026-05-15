package chess.controller;

import chess.model.Game;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Implementation for game controller.
 */
public class GameControllerImpl implements GameController {

  private Game model;

  /**
   * Initializes game controller with model.
   *
   * @param game Game model
   */
  public GameControllerImpl(Game game) {
    model = game;
  }

  @Override
  public void run() {
    String command;
    Scanner input = new Scanner(System.in);

    while (true) {
      try {
        command = input.nextLine().strip();
      } catch (NoSuchElementException e) {
        break;
      }

      try {
        if (command.toLowerCase().equals("exit")) {
          break;
        }

      } catch (Exception e) {
        break;
      }
    }

    System.exit(0);
  }

}

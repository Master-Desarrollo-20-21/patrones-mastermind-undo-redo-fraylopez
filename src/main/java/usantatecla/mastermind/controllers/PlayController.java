package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class PlayController extends Controller implements AcceptorController {

  private ProposalController proposalController;
  private UndoController undoController;
  private RedoController redoController;

  public PlayController(Session session) {
    super(session);
    this.proposalController = new ProposalController(session);
    this.undoController = new UndoController(session);
    this.redoController = new RedoController(session);
  }

  public void undo() {
    this.undoController.undo();
  }

  public boolean isUndoable() {
    return this.undoController.isUndoable();
  }

  public void redo() {
    this.redoController.redo();
  }

  public boolean isRedoable() {
    return this.redoController.isRedoable();
  }

  public void accept(ControllersVisitor controllerVisitor) {
    controllerVisitor.visit(this);
  }

  public List<Color> getColors(int position) {
    return this.proposalController.getColors(position);
  }

  public Error addProposedCombination(List<Color> colors) {
    return this.proposalController.addProposedCombination(colors);
  }

  public int getAttempts() {
    return this.proposalController.getAttempts();
  }

  public int getBlacks(int position) {
    return this.proposalController.getWhites(position);
  }

  public int getWhites(int position) {
    return this.proposalController.getWhites(position);
  }

  public boolean isWinner() {
    return this.proposalController.isWinner();
  }

  public boolean isLooser() {
    return this.proposalController.isLooser();
  }
}

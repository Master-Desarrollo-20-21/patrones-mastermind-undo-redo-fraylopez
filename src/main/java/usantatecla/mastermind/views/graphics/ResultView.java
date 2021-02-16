package usantatecla.mastermind.views.graphics;

import javax.swing.JLabel;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

@SuppressWarnings("serial")
class ResultView extends JLabel {

	private PlayController controller;

	ResultView(PlayController proposalController) {
		this.controller = proposalController;
		this.setText(MessageView.RESULT.getMessage()
				.replaceFirst("#blacks", "" + this.controller.getBlacks(this.controller.getAttempts() - 1))
				.replaceFirst("#whites", "" + this.controller.getWhites(this.controller.getAttempts() - 1)));
	}

}

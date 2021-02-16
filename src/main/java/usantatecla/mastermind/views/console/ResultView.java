package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	private PlayController controller;

	ResultView(PlayController proposalController) {
		this.controller = proposalController;
	}

	void writeln(int i) {
		this.console.writeln(MessageView.RESULT.getMessage().replaceFirst("#blacks", "" + this.controller.getBlacks(i))
				.replaceFirst("#whites", "" + this.controller.getWhites(i)));
	}

}

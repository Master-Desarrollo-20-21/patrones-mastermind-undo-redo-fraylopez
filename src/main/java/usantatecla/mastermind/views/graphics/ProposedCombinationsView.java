package usantatecla.mastermind.views.graphics;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import usantatecla.mastermind.controllers.PlayController;

@SuppressWarnings("serial")
class ProposedCombinationsView extends JPanel {

	ProposedCombinationsView() {
		this.setLayout(new GridBagLayout());
	}

	void add(PlayController controller) {
		int attempts = controller.getAttempts();
		this.add(new AttemptsView(attempts), new Constraints(0, attempts, 1, 1));
		this.add(new ProposedCombinationView(controller), new Constraints(1, attempts, 1, 1));
		this.add(new ResultView(controller), new Constraints(2, attempts, 1, 1));
	}
}

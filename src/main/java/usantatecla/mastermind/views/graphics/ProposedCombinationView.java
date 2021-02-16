package usantatecla.mastermind.views.graphics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.views.ColorView;

@SuppressWarnings("serial")
class ProposedCombinationView extends JLabel {

	public static final int ERROR_CODE = -1;

	private PlayController controller;

	ProposedCombinationView(PlayController controller) {
		this.controller = controller;
		String initials = "";
		for (Color color : this.controller.getColors(this.controller.getAttempts() - 1)) {
			initials += new ColorView(color).getInitial();
		}
		this.setText(initials);
	}

	ProposedCombinationView() {
	}

	List<Color> read(String characters) {
		List<Color> colors = new ArrayList<Color>();
		for (int i = 0; i < characters.length(); i++) {
			colors.add(ColorView.getInstance(characters.charAt(i)));
		}
		return colors;
	}

}

package Jetstorm.Enterprise.Entities.Pokemon.Moves;

import java.awt.Graphics2D;

public class Tackle extends Move {

	public Tackle() {
		init();
	}

	public void init() {

		name = "TACKLE";
		type = 0;
		power = 50;
		powerPoints = 35;
		currentPowerPoints = 35;
		accuracy = 100;
		fileLocation = "";
		frames = 3;
		width = 64;
		height = 64;
		attackType = 0;

		super.init();

	}

	public void update() {
		super.update();
	}

	public void draw(Graphics2D g) {
		super.draw(g);
	}

}

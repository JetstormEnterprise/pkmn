package Jetstorm.Enterprise.Entities.Pokemon.Moves;

import java.awt.Graphics2D;

public class Ember extends Move {

	public Ember() {
		init();
	}

	public void init() {

		name = "EMBER";
		type = 9;
		power = 30;
		powerPoints = 25;
		currentPowerPoints = 25;
		accuracy = 95;
		fileLocation = "/moves/ember.png";
		frames = 5;
		width = 64;
		height = 64;
		widthOffset = 0;
		heightOffset = 10;
		attackType = 1;

		super.init();

	}

	public void update() {
		super.update();
	}

	public void draw(Graphics2D g) {
		super.draw(g);
	}

}

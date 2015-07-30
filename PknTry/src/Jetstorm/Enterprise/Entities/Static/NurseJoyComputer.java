package Jetstorm.Enterprise.Entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.MapObject;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.TileMap.TileMap;

public class NurseJoyComputer extends MapObject {

	private BufferedImage[] image;

	public NurseJoyComputer(TileMap tm) {
		super(tm);
		init();
	}

	private void init() {

		try {

			image = new BufferedImage[1];
			image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/nursejoycomp.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(image);
		animation.setDelay(800);

	}

	public void moveDown() {
		y = y - 1;
	}

	public void moveUp() {
		y = y + 1;
	}

	public void moveRight() {
		x = x - 1;
	}

	public void moveLeft() {
		x = x + 1;
	}

	public void update() {

		if (tileMap.movedDirection("up"))
			moveUp();
		else if (tileMap.movedDirection("down"))
			moveDown();
		else if (tileMap.movedDirection("left"))
			moveLeft();
		else if (tileMap.movedDirection("right"))
			moveRight();

		animation.update();

	}

	public void draw(Graphics2D g) {

		super.draw(g);

	}

}

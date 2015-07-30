package Jetstorm.Enterprise.Entities.Static;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.MapObject;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.TileMap.TileMap;

public class Desk extends MapObject {

	private BufferedImage[] image;
	private String type;

	public Desk(TileMap tm, String deskType) {
		super(tm);
		type = deskType;
		init();
	}

	private void init() {

		try {

			image = new BufferedImage[1];
			if (type.equalsIgnoreCase("fooddesk"))
				image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/fooddesk.png"));
			else if (type.equalsIgnoreCase("pokemoncenterdesk"))
				image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/pokemoncenterdesk.png"));
			else if (type.equalsIgnoreCase("pokemonmartdesk"))
				image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/pokemonmartdesk.png"));
			else if (type.equalsIgnoreCase("pokemonhelpdesk"))
				image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/pokemonhelpdesk.png"));
			else if (type.equalsIgnoreCase("pokemonbasedesk"))
				image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/pokemonbasedesk.png"));
			else if (type.equalsIgnoreCase("pokemonmartdesk2"))
				image[0] = ImageIO.read(getClass().getResourceAsStream("/entities/pokemonmartdesk2.png"));

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

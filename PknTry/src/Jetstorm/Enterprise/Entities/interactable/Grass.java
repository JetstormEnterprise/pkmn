package Jetstorm.Enterprise.Entities.interactable;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.MapObject;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.TileMap.TileMap;

public class Grass extends MapObject {

	private BufferedImage[] image;
	private boolean playAnim = false;

	public Grass(TileMap tm) {
		super(tm);
		init();
	}

	public void init() {

		try {

			image = new BufferedImage[4];
			for (int i = 0; i < 4; i++) {
				image[i] = ImageIO.read(getClass().getResourceAsStream("/entities/grassover.png")).getSubimage(16 * i,
						0, 16, 16);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(image);
		animation.setDelay(150);

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

	public void setPlayAnim(boolean play) {
		playAnim = play;
	}

	public void update() {

		if (tileMap.movedDirection("Up"))
			moveUp();
		else if (tileMap.movedDirection("down"))
			moveDown();
		else if (tileMap.movedDirection("left"))
			moveLeft();
		else if (tileMap.movedDirection("right"))
			moveRight();

		if (playAnim) {
			animation.update();
			if (animation.hasPlayedOnce()) {
				playAnim = false;
				animation.setFrame(0);
				animation.resetAnim();
			}
		}

	}

	public void draw(Graphics2D g) {

		if (playAnim) {
			super.draw(g);
		}

	}

}

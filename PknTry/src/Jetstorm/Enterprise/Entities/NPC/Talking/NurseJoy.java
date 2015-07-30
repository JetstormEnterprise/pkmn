package Jetstorm.Enterprise.Entities.NPC.Talking;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.Handlers.Font.FontLoader;
import Jetstorm.Enterprise.TileMap.TileMap;

public class NurseJoy extends NPC {

	public NurseJoy(TileMap tm, Player player) {
		super(tm, player);
		init();
	}

	public void init() {

		try {

			image = new BufferedImage[4];
			for (int i = 0; i < 4; i++) {
				image[i] = ImageIO.read(getClass().getResourceAsStream("/entities/nursejoy.png")).getSubimage(24 * i,
						0, 24, 32);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(image);
		animation.setDelay(100);
		down = true;

	}

	public void update() {

		if (startWait) {
			waitTime++;
			if (waitTime >= 180) {
				waitTime = 0;
				startWait = false;
			}
		}

		if (left) {
			animation.setFrame(1);
		} else if (right) {
			animation.setFrame(2);
		} else if (up) {
			animation.setFrame(3);
		} else if (down) {
			animation.setFrame(0);
		}

		if (player.getInteract()) {
			if (player.getDirection().equalsIgnoreCase("Up")) {
				if (player.getx() - 11 == x && player.gety() - 48 == y) {
					if (!player.isBusy() && !startWait) {
						currentTextSpot = 0;
						line1 = "Test";
						line2 = "Test";
						topText = FontLoader.getDarkTranslation(line1);
						botText = FontLoader.getDarkTranslation(line2);
						player.setBusy(true);
						talking = true;
					}
				}
			}
		}

		if (conversation == 0) {
			maxTextSpot = 3;
			if (currentTextSpot == 0) {
				line1 = "Welcome to the Pokemon Center.";
				line2 = "How may I help you?";
			} else if (currentTextSpot == 1) {
				line1 = "Oh my, Your pokemon are hurt!";
				line2 = "I will help your pokemon right away!";
			} else if (currentTextSpot == 2) {
				line1 = "Help me Chansey.";
				line2 = "We will heal them quickly.";
			}
		}

		if (tileMap.movedDirection("up"))
			moveUp();
		else if (tileMap.movedDirection("down"))
			moveDown();
		else if (tileMap.movedDirection("left"))
			moveLeft();
		else if (tileMap.movedDirection("right"))
			moveRight();

		handleInput();

	}

	public void draw(Graphics2D g) {

		g.drawImage(animation.getImage(), (int) (x + xmap - width / 2), (int) (y + ymap - height / 2), null);

	}

	public void handleInput() {

		super.handleInput();

	}

}

package Jetstorm.Enterprise.Entities.NPC.Pokemon;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.Handlers.Animation;
import Jetstorm.Enterprise.TileMap.TileMap;

public class Chansey extends NPC {

	public Chansey(TileMap tm, Player player) {
		super(tm, player);
		init();
	}

	public void init() {

		try {
			image = new BufferedImage[1];
			for (int i = 0; i < 1; i++) {
				image[i] = ImageIO.read(getClass().getResourceAsStream("/entities/chansey.png")).getSubimage(0, 0, 19,
						17);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		animation = new Animation();
		animation.setFrames(image);
		animation.setDelay(100);

	}

	public void update() {

		super.update();

	}

	public void draw(Graphics2D g) {

		super.draw(g);

	}

}

package Jetstorm.Enterprise.Entities.NPC.Talking;

import java.awt.Graphics2D;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.TileMap.TileMap;

public class FemaleMart extends NPC {

	public FemaleMart(TileMap tm, Player player, String direction) {
		super(tm, player);
		this.direction = direction;
		init();
	}

	public void init() {

		fileLocation = "/entities/femalemart.png";
		width = 16;
		height = 20;
		xOffset = 1;
		yOffset = 1;

		super.init();

	}

	public void update() {

		super.update();

	}

	public void draw(Graphics2D g) {

		super.draw(g);

	}

}

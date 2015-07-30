package Jetstorm.Enterprise.Entities.NPC.Idle;

import java.awt.Graphics2D;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.TileMap.TileMap;

public class FemaleChild extends NPC {

	public FemaleChild(TileMap tm, Player player, String direction) {
		super(tm, player);
		this.direction = direction;
		init();
	}

	public void init() {

		fileLocation = "/entities/femalechild.png";
		width = 16;
		height = 17;
		xOffset = 1;
		yOffset = -1;

		super.init();

	}

	public void update() {

		super.update();

	}

	public void draw(Graphics2D g) {

		super.draw(g);

	}

}

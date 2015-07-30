package Jetstorm.Enterprise.Entities.NPC.Idle;

import java.awt.Graphics2D;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.TileMap.TileMap;

public class OldMan extends NPC {

	public OldMan(TileMap tm, Player player, String direction) {
		super(tm, player);
		this.direction = direction;
		init();
	}

	public void init() {
		
		fileLocation = "/entities/oldman.png";
		width = 16;
		height = 19;
		
		super.init();

	}

	public void update() {

		super.update();

	}

	public void draw(Graphics2D g) {

		super.draw(g);

	}

}

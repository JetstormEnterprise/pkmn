package Jetstorm.Enterprise.Maps;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.TileMap.TileMap;

public abstract class MainAbstractMap {

	protected String map;
	protected Player player;
	protected TileMap tileMap;

	public MainAbstractMap(Player player, TileMap tileMap) {
		this.player = player;
		this.tileMap = tileMap;
	}

	public void createBlock(int x, int y, int width, int height) {

	}

}

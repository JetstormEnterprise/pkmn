package Jetstorm.Enterprise.GameState;

import java.awt.Graphics2D;
import java.util.ArrayList;

import Jetstorm.Enterprise.Entities.Static.BuildingClass;
import Jetstorm.Enterprise.Entities.Static.OrangeFlower;
import Jetstorm.Enterprise.Entities.interactable.Grass;
import Jetstorm.Enterprise.TileMap.TileMap;

public class TestLevelState extends GameState {

	private TileMap tileMap;
	private BuildingClass pokeCenter;
	private BuildingClass tower;

	private ArrayList<OrangeFlower> ofs;
	private ArrayList<Grass> grass;

	public TestLevelState(GameStateManager gsm) {
		super(gsm);
		init();
	}

	public void init() {

		tileMap = new TileMap(16);
		tileMap.loadTiles("/maps/testtileset.gif");
		tileMap.loadMap("/maps/TestMap1.map");
		tileMap.setTween(1);

		tileMap.setPosition(-15 - (16 * 30), -2 - (16 * 25));

		tileMap.createBlockedArea(0, -16, 1040, 16);
		tileMap.createBlockedArea(0, 0, 16, 80);

		tileMap.createBlockedArea(-336, -352, 112, 112);
		tileMap.createBlockedArea(-352, -464, 80, 16);
		tileMap.createBlockedArea(-368, -480, 48, 80);

		pokeCenter = new BuildingClass(tileMap, "pokemoncenter1");
		pokeCenter.setPosition(16 * 7, -16 * 9);
		pokeCenter.createBuildingArea("pokemonCenter1");

		tower = new BuildingClass(tileMap, "corperate1");
		tower.setPosition(-16 * 10, -16 * 22);
		tower.createBuildingArea("corperate1");

		ofs = new ArrayList<OrangeFlower>();
		for (int i = 0; i < 5; i++) {
			OrangeFlower of = new OrangeFlower(tileMap);
			of.setPosition(64 + (16 * i), 32);
			ofs.add(of);
		}

		grass = new ArrayList<Grass>();
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < 8; k++) {
				Grass gr = new Grass(tileMap);
				gr.setPosition(-32 + (16 * i), -48 + (16 * k));
				grass.add(gr);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 4; k++) {
				Grass gr = new Grass(tileMap);
				gr.setPosition(96 + (16 * i), 80 + (16 * k));
				grass.add(gr);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 4; k++) {
				Grass gr = new Grass(tileMap);
				gr.setPosition(-304 - (16 * i), -112 - (16 * k));
				grass.add(gr);
			}
		}

	}

	public void update() {

		handleInput();
		gsm.player.update();
		pokeCenter.update();
		tower.update();

		for (int i = 0; i < ofs.size(); i++) {
			ofs.get(i).update();
		}
		for (int i = 0; i < grass.size(); i++) {
			if (gsm.player.getMoveDown() && gsm.player.getx() - 7 == grass.get(i).getx()
					&& gsm.player.gety() + 7 == grass.get(i).gety()) {
				grass.get(i).setPlayAnim(true);
			} else if (gsm.player.getMoveLeft() && gsm.player.getx() - 15 == grass.get(i).getx() //
					&& gsm.player.gety() - 2 == grass.get(i).gety()) {
				grass.get(i).setPlayAnim(true);
			} else if (gsm.player.getMoveRight() && gsm.player.getx() + 1 == grass.get(i).getx()
					&& gsm.player.gety() - 2 == grass.get(i).gety()) {
				grass.get(i).setPlayAnim(true);
			} // else if (player.getMoveUp() && player.getx() - 7 ==
				// grass.get(i).getx() //
				// && player.gety() - 15 == grass.get(i).gety()) {
				// grass.get(i).setPlayAnim(true);
			// }
			grass.get(i).update();
		}

		tileMap.update();

		if (tileMap.getx() == -639 && tileMap.gety() == -322) {
			gsm.setState(GameStateManager.POKEMONSUPERCENTER);
		}

	}

	public void draw(Graphics2D g) {

		tileMap.draw(g);

		for (int i = 0; i < ofs.size(); i++) {
			ofs.get(i).draw(g);
		}

		pokeCenter.draw(g);
		tower.draw(g);
		gsm.player.draw(g);
		pokeCenter.drawVoid(g);
		tower.drawVoid(g);

		for (int i = 0; i < grass.size(); i++) {
			grass.get(i).draw(g);
		}

		gsm.player.drawText(g);

	}

	public void handleInput() {

		gsm.player.handleInput();

	}

}

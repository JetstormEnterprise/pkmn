package Jetstorm.Enterprise.Entities.NPC.Trainers;

import java.awt.Graphics2D;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.TileMap.TileMap;

public class TestTrainer extends Trainer {

	public TestTrainer(TileMap tm, Player player, Pokemon[] newPokemon, int newMoney) {
		super(tm, player, newPokemon, newMoney);
	}

	public void update() {
		super.update();
	}

	public void draw(Graphics2D g) {
		super.draw(g);
	}

}

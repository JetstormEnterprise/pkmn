package Jetstorm.Enterprise.Entities.NPC.Trainers;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Jetstorm.Enterprise.Entities.Player;
import Jetstorm.Enterprise.Entities.NPC.NPC;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;
import Jetstorm.Enterprise.TileMap.TileMap;

public class Trainer extends NPC {

	protected boolean defeated;
	protected int money;
	protected BufferedImage trainerImage;
	protected String name;
	protected String defeatText;
	protected Pokemon[] pokemon;

	public Trainer(TileMap tm, Player player, Pokemon[] newPokemon, int newMoney) {
		super(tm, player);
		defeated = false;
		pokemon = newPokemon;
		money = newMoney;
		super.init();
	}

	public void setPokemon(Pokemon[] newPokemon) {
		pokemon = newPokemon;
	}

	public int getFirstAblePokemon() {
		int temp = 0;
		boolean tempB = false;

		for (int i = 0; i < pokemon.length; i++) {
			if (!pokemon[i].getFainted() && !tempB) {
				temp = i;
				tempB = true;
			}
		}

		return temp;

	}

	public boolean isDefeated() {
		boolean temp = true;

		for (int i = 0; i < pokemon.length; i++) {
			if (!pokemon[i].getFainted()) {
				temp = false;
			}
		}

		return temp;

	}

	public int getMoney() {
		return money;
	}

	public void update() {
		super.update();
	}

	public void draw(Graphics2D g) {
		super.draw(g);
	}

}

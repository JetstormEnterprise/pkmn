package Jetstorm.Enterprise.Handlers;

import java.awt.Graphics2D;
import java.util.ArrayList;

import Jetstorm.Enterprise.Entities.Items.Items;
import Jetstorm.Enterprise.Entities.Pokemon.Pokemon;

public class PlayerBag {

	public static ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>();
	public static ArrayList<ArrayList<Items>> items;

	public static void setItems(ArrayList<ArrayList<Items>> newItems) {

		items = newItems;

	}

	public static void setPokemon(ArrayList<Pokemon> list) {
		pokemon = list;
	}

	public static ArrayList<Items> getItemList(int array) {

		return items.get(array);

	}

	public static int getArraySize() {

		return pokemon.size();
	}

	public static Pokemon getPokemon(int pokemonNum) {
		return pokemon.get(pokemonNum);
	}

	public static int getFirstPokemon() {

		int temp = -1;

		for (int i = 0; i < pokemon.size(); i++) {
			if (!pokemon.get(i).getFainted()) {
				temp = i;
				return i;
			}
		}

		return temp;

	}

	public static void update() {

		for (int i = 0; i < pokemon.size(); i++) {
			if (pokemon.get(i) != null) {
				pokemon.get(i).update();
			}
		}

	}

	public static void draw(Graphics2D g) {

	}

}

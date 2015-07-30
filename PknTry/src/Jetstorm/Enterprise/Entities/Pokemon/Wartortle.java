package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Wartortle extends Pokemon {

	public Wartortle(int startingLevel) {

		species = "WARTORTLE";
		nickname = "WARTORTLE";
		typeOne = 10;
		typeTwo = 18;
		pkmNumber = 8;
		abilityOne = 3; // Torrent
		hiddenAbility = 3; // Rain Dish
		friendship = 70;
		bodyStyle = 6;
		pokemonColor = 2;
		eggGroup = 1;
		secondEggGroup = 2;
		height = 1.0; // meters standard
		weight = 22.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 142;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 59;
		baseAttack = 63;
		baseDefense = 80;
		baseSpAttack = 65;
		baseSpDefense = 80;
		baseSpeed = 58;
		super.init(startingLevel);

	}

	public void init(int startingLevel) {

	}

	public void setMoveList(Move[] moves) {

		movesList = new Move[moves.length];
		movesList = moves;

	}

	public void levelUp() {

	}

	public void learnMove(int replaceMoveNumber) {

	}

	public void forgetMove(int moveNumber) {

	}

}

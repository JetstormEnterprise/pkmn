package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Blastoise extends Pokemon {

	public Blastoise(int startingLevel) {

		species = "BLASTOISE";
		nickname = "BLASTOISE";
		typeOne = 10;
		typeTwo = 18;
		pkmNumber = 9;
		abilityOne = 3; // Torrent
		hiddenAbility = 3; // Rain Dish
		friendship = 70;
		bodyStyle = 6;
		pokemonColor = 2;
		eggGroup = 1;
		secondEggGroup = 2;
		height = 1.6; // meters standard
		weight = 85.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 239;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 3;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 79;
		baseAttack = 83;
		baseDefense = 100;
		baseSpAttack = 85;
		baseSpDefense = 105;
		baseSpeed = 78;
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

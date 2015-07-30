package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Squirtle extends Pokemon {

	public Squirtle(int startingLevel) {

		species = "SQUIRTLE";
		nickname = "SQUIRTLE";
		typeOne = 10;
		typeTwo = 18;
		pkmNumber = 7;
		abilityOne = 3; // Torrent
		hiddenAbility = 3; // Rain Dish
		friendship = 70;
		bodyStyle = 6;
		pokemonColor = 2;
		eggGroup = 1;
		secondEggGroup = 2;
		height = 0.5; // meters standard
		weight = 9.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 63;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 44;
		baseAttack = 48;
		baseDefense = 65;
		baseSpAttack = 50;
		baseSpDefense = 64;
		baseSpeed = 43;
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

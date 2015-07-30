package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Venusaur extends Pokemon {

	public Venusaur(int startingLevel) {

		species = "VENUSAUR";
		nickname = "VENUSAUR";
		typeOne = 11;
		typeTwo = 3;
		pkmNumber = 3;
		abilityOne = 1; // Overgrow
		hiddenAbility = 1; // Chlorophyll
		friendship = 70;
		bodyStyle = 8;
		pokemonColor = 4;
		eggGroup = 1;
		secondEggGroup = 7;
		height = 2.0; // meters standard
		weight = 100.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 236;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 80;
		baseAttack = 82;
		baseDefense = 83;
		baseSpAttack = 100;
		baseSpDefense = 100;
		baseSpeed = 80;
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

package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Charmander extends Pokemon {

	public Charmander(int startingLevel) {

		species = "CHARMANDER";
		nickname = "CHARMANDER";
		typeOne = 9;
		typeTwo = 18;
		pkmNumber = 4;
		abilityOne = 2; // Blaze
		hiddenAbility = 2; // Solar Power
		friendship = 70;
		bodyStyle = 6;
		pokemonColor = 1;
		eggGroup = 1;
		secondEggGroup = 14;
		height = 0.6; // meters standard
		weight = 8.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 64;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 39;
		baseAttack = 52;
		baseDefense = 43;
		baseSpAttack = 60;
		baseSpDefense = 50;
		baseSpeed = 65;
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

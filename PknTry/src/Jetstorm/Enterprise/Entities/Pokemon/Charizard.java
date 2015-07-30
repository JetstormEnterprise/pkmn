package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Charizard extends Pokemon {

	public Charizard(int startingLevel) {

		species = "CHARIZARD";
		nickname = "CHARIZARD";
		typeOne = 9;
		typeTwo = 2;
		pkmNumber = 6;
		abilityOne = 2; // Blaze
		hiddenAbility = 2; // Solar Power
		friendship = 70;
		bodyStyle = 6;
		pokemonColor = 1;
		eggGroup = 1;
		secondEggGroup = 14;
		height = 1.7; // meters standard
		weight = 90.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 240;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 3;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 78;
		baseAttack = 84;
		baseDefense = 78;
		baseSpAttack = 109;
		baseSpDefense = 85;
		baseSpeed = 100;
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

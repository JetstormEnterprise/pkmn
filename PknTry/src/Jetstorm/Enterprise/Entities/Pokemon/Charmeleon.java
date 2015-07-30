package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Charmeleon extends Pokemon {

	public Charmeleon(int startingLevel) {

		species = "CHARMELEON";
		nickname = "CHARMELEON";
		typeOne = 9;
		typeTwo = 18;
		pkmNumber = 5;
		abilityOne = 2; // Blaze
		hiddenAbility = 2; // Solar Power
		friendship = 70;
		bodyStyle = 6;
		pokemonColor = 1;
		eggGroup = 1;
		secondEggGroup = 14;
		height = 1.1; // meters standard
		weight = 19.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 142;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 58;
		baseAttack = 64;
		baseDefense = 58;
		baseSpAttack = 80;
		baseSpDefense = 65;
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

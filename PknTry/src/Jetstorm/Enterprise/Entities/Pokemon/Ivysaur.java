package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Ivysaur extends Pokemon {

	public Ivysaur(int startingLevel) {

		species = "IVYSAUR";
		nickname = "IVYSAUR";
		typeOne = 11;
		typeTwo = 3;
		pkmNumber = 2;
		abilityOne = 1; // Overgrow
		hiddenAbility = 1; // Chlorophyll
		friendship = 70;
		bodyStyle = 8;
		pokemonColor = 4;
		eggGroup = 1;
		secondEggGroup = 7;
		height = 1.0; // meters standard
		weight = 13.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 142;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 60;
		baseAttack = 62;
		baseDefense = 63;
		baseSpAttack = 80;
		baseSpDefense = 80;
		baseSpeed = 60;
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

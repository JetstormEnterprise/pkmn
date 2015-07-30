package Jetstorm.Enterprise.Entities.Pokemon;

import Jetstorm.Enterprise.Entities.Pokemon.Moves.Move;

public class Bulbasaur extends Pokemon {

	public Bulbasaur(int startingLevel) {

		species = "BULBASAUR";
		nickname = "BULBASAUR";
		typeOne = 11;
		typeTwo = 3;
		pkmNumber = 1;
		abilityOne = 1; // Overgrow
		hiddenAbility = 1; // Chlorophyll
		friendship = 70;
		bodyStyle = 8;
		pokemonColor = 4;
		eggGroup = 1;
		secondEggGroup = 7;
		height = 0.7; // meters standard
		weight = 6.2; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 64;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.875;
		catchRate = 45;
		baseHealth = 45;
		baseAttack = 49;
		baseDefense = 49;
		baseSpAttack = 65;
		baseSpDefense = 65;
		baseSpeed = 45;
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

package Jetstorm.Enterprise.Entities.Pokemon;

public class Zubat extends Pokemon {

	public Zubat(int startingLevel) {

		species = "ZUBAT";
		nickname = "ZUBAT";
		typeOne = 3; // poison
		typeTwo = 2; // flying
		pkmNumber = 41;
		abilityOne = 1; // inner focus
		hiddenAbility = 1; // infiltrator
		friendship = 70;
		bodyStyle = 9; // single set of wings
		pokemonColor = 7; // purple
		eggGroup = 4; // flying
		secondEggGroup = 18; // none
		height = 0.8; // meters standard
		weight = 7.5; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 49;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 40;
		baseAttack = 45;
		baseDefense = 35;
		baseSpAttack = 30;
		baseSpDefense = 40;
		baseSpeed = 55;
		super.init(startingLevel);

	}

}

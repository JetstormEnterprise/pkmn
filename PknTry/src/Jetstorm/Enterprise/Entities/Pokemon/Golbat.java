package Jetstorm.Enterprise.Entities.Pokemon;

public class Golbat extends Pokemon {

	public Golbat(int startingLevel) {

		species = "GOLBAT";
		nickname = "GOLBAT";
		typeOne = 3; // poison
		typeTwo = 2; // flying
		pkmNumber = 42;
		abilityOne = 1; // Inner Focus
		hiddenAbility = 1; // Infiltrator
		friendship = 70;
		bodyStyle = 9; // single pair of wings
		pokemonColor = 7; // purple
		eggGroup = 4; // flying
		secondEggGroup = 18; // none
		height = 1.6; // meters standard
		weight = 55.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 159;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 75;
		baseAttack = 80;
		baseDefense = 70;
		baseSpAttack = 65;
		baseSpDefense = 75;
		baseSpeed = 90;
		super.init(startingLevel);

	}

}

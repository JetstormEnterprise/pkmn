package Jetstorm.Enterprise.Entities.Pokemon;

public class Caterpie extends Pokemon {

	public Caterpie(int startingLevel) {

		species = "CATERPIE";
		nickname = "CATERPIE";
		typeOne = 6; // bug
		typeTwo = 18;
		pkmNumber = 10;
		abilityOne = 1; // Shield Dust
		hiddenAbility = 1; // Run Away
		friendship = 70;
		bodyStyle = 14; // Insectoid
		pokemonColor = 4;
		eggGroup = 3; // bug
		secondEggGroup = 0; // none
		height = 0.3; // meters standard
		weight = 2.9; // kg standard
		hatchTime = 2805; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 39;
		EVYield[0] = 1;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 45;
		baseAttack = 30;
		baseDefense = 35;
		baseSpAttack = 20;
		baseSpDefense = 20;
		baseSpeed = 45;
		super.init(startingLevel);

	}

}

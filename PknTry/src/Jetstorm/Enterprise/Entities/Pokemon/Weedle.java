package Jetstorm.Enterprise.Entities.Pokemon;

public class Weedle extends Pokemon {

	public Weedle(int startingLevel) {

		species = "WEEDLE";
		nickname = "WEEDLE";
		typeOne = 6; // bug
		typeTwo = 3; // poison
		pkmNumber = 13;
		abilityOne = 1; // Shield Dust
		hiddenAbility = 1; // Run Away
		friendship = 70;
		bodyStyle = 14; // Insectoid
		pokemonColor = 6; // brown
		eggGroup = 3; // bug
		secondEggGroup = 0; // none
		height = 0.3; // meters standard
		weight = 3.2; // kg standard
		hatchTime = 2805; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 39;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 40;
		baseAttack = 35;
		baseDefense = 30;
		baseSpAttack = 20;
		baseSpDefense = 20;
		baseSpeed = 50;
		super.init(startingLevel);

	}

}

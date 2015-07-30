package Jetstorm.Enterprise.Entities.Pokemon;

public class Butterfree extends Pokemon {

	public Butterfree(int startingLevel) {

		species = "BUTTERFREE";
		nickname = "BUTTERFREE";
		typeOne = 6; // bug
		typeTwo = 2; // Flying
		pkmNumber = 12;
		abilityOne = 1; // Compound Eyes
		hiddenAbility = 1; // Tinted Lens
		friendship = 70;
		bodyStyle = 13; // Two pairs of wings
		pokemonColor = 9; // White
		eggGroup = 3; // bug
		secondEggGroup = 0; // none
		height = 1.1; // meters standard
		weight = 32.0; // kg standard
		hatchTime = 2805; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 173;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 60;
		baseAttack = 45;
		baseDefense = 50;
		baseSpAttack = 80;
		baseSpDefense = 80;
		baseSpeed = 70;
		super.init(startingLevel);

	}

}

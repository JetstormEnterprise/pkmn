package Jetstorm.Enterprise.Entities.Pokemon;

public class Ninetales extends Pokemon {

	public Ninetales(int startingLevel) {

		species = "NINETALES";
		nickname = "NINETALES";
		typeOne = 9; // fire
		typeTwo = 18;
		pkmNumber = 38;
		abilityOne = 1; // flash fire
		hiddenAbility = 1; // drought
		friendship = 70;
		bodyStyle = 8; // four legs body head
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 0; // none
		height = 1.1; // meters standard
		weight = 19.9; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 177;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 1;
		genderRatio = 0.25;
		catchRate = 75;
		baseHealth = 73;
		baseAttack = 76;
		baseDefense = 75;
		baseSpAttack = 81;
		baseSpDefense = 100;
		baseSpeed = 100;
		super.init(startingLevel);

	}

}

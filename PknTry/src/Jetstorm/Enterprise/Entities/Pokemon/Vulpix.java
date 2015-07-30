package Jetstorm.Enterprise.Entities.Pokemon;

public class Vulpix extends Pokemon {

	public Vulpix(int startingLevel) {

		species = "VULPIX";
		nickname = "VULPIX";
		typeOne = 9; // fire
		typeTwo = 18;
		pkmNumber = 37;
		abilityOne = 1; // flash fire
		hiddenAbility = 1; // drought
		friendship = 70;
		bodyStyle = 8; // four legs body head
		pokemonColor = 1; // brouwn
		eggGroup = 5; // field
		secondEggGroup = 0; // none
		height = 0.6; // meters standard
		weight = 9.9; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 60;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.25;
		catchRate = 190;
		baseHealth = 38;
		baseAttack = 41;
		baseDefense = 40;
		baseSpAttack = 50;
		baseSpDefense = 65;
		baseSpeed = 65;
		super.init(startingLevel);

	}

}

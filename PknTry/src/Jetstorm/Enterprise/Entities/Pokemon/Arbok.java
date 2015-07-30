package Jetstorm.Enterprise.Entities.Pokemon;

public class Arbok extends Pokemon {

	public Arbok(int startingLevel) {

		species = "ARBOK";
		nickname = "ARBOK";
		typeOne = 3; // poison
		typeTwo = 18;
		pkmNumber = 24;
		abilityOne = 1; // intimidate or shed skin
		hiddenAbility = 1; // unnerve
		friendship = 70;
		bodyStyle = 2; // serpentine
		pokemonColor = 7; // purple
		eggGroup = 5; // field
		secondEggGroup = 14; // dragon
		height = 3.5; // meters standard
		weight = 65.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium fast";
		baseExpYield = 153;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 60;
		baseAttack = 85;
		baseDefense = 69;
		baseSpAttack = 65;
		baseSpDefense = 79;
		baseSpeed = 80;
		super.init(startingLevel);

	}

}

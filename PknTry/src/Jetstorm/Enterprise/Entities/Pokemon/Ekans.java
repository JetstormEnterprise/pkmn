package Jetstorm.Enterprise.Entities.Pokemon;

public class Ekans extends Pokemon {

	public Ekans(int startingLevel) {

		species = "EKANS";
		nickname = "EKANS";
		typeOne = 3; // poison
		typeTwo = 18;
		pkmNumber = 23;
		abilityOne = 1; // intimidate or shed skin
		hiddenAbility = 1; // unnerve
		friendship = 70;
		bodyStyle = 2; // serpentine
		pokemonColor = 7; // purple
		eggGroup = 5; // field
		secondEggGroup = 14; // dragon
		height = 2.0; // meters standard
		weight = 6.9; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 58;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 35;
		baseAttack = 60;
		baseDefense = 44;
		baseSpAttack = 40;
		baseSpDefense = 54;
		baseSpeed = 55;
		super.init(startingLevel);

	}

}

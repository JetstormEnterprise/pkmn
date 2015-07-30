package Jetstorm.Enterprise.Entities.Pokemon;

public class Golduck extends Pokemon {

	public Golduck(int startingLevel) {

		species = "GOLDUCK";
		nickname = "GOLDUCK";
		typeOne = 10; // water
		typeTwo = 18;
		pkmNumber = 55;
		abilityOne = 1; // damp or cloud nine
		hiddenAbility = 1; // swift swim
		friendship = 70;
		bodyStyle = 6; // two legs, tail
		pokemonColor = 2; // blue
		eggGroup = 2; // water 1
		secondEggGroup = 5; // field
		height = 1.7; // meters standard
		weight = 76.6; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 175;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 80;
		baseAttack = 82;
		baseDefense = 78;
		baseSpAttack = 95;
		baseSpDefense = 80;
		baseSpeed = 85;
		super.init(startingLevel);

	}

}

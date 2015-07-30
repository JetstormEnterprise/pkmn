package Jetstorm.Enterprise.Entities.Pokemon;

public class Psyduck extends Pokemon {

	public Psyduck(int startingLevel) {

		species = "PSYDUCK";
		nickname = "PSYDUCK";
		typeOne = 10; // water
		typeTwo = 18;
		pkmNumber = 54;
		abilityOne = 1; // damp or cloud nine
		hiddenAbility = 1; // swift swim
		friendship = 70;
		bodyStyle = 6; // two legs, tail
		pokemonColor = 3; // yellow
		eggGroup = 2; // water 1
		secondEggGroup = 5; // field
		height = 0.8; // meters standard
		weight = 19.6; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 64;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 50;
		baseAttack = 52;
		baseDefense = 48;
		baseSpAttack = 65;
		baseSpDefense = 50;
		baseSpeed = 55;
		super.init(startingLevel);

	}

}

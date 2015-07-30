package Jetstorm.Enterprise.Entities.Pokemon;

public class Pikachu extends Pokemon {

	public Pikachu(int startingLevel) {

		species = "PIKACHU";
		nickname = "PIKACHU";
		typeOne = 12; // electric
		typeTwo = 18;
		pkmNumber = 25;
		abilityOne = 1; // static
		hiddenAbility = 1; // lightning rod
		friendship = 70;
		bodyStyle = 6; // four legs, body, head
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 6; // fairy
		height = 0.4; // meters standard
		weight = 6.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium fast";
		baseExpYield = 105;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 35;
		baseAttack = 55;
		baseDefense = 30;
		baseSpAttack = 50;
		baseSpDefense = 40;
		baseSpeed = 90;
		super.init(startingLevel);

	}

}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Raichu extends Pokemon {

	public Raichu(int startingLevel) {

		species = "RAICHU";
		nickname = "RAICHU";
		typeOne = 12; // electric
		typeTwo = 18;
		pkmNumber = 26;
		abilityOne = 1; // static
		hiddenAbility = 1; // lightning rod
		friendship = 70;
		bodyStyle = 6; // two legs body head
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 6; // fairy
		height = 0.8; // meters standard
		weight = 30.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 214;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 3;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 60;
		baseAttack = 90;
		baseDefense = 55;
		baseSpAttack = 90;
		baseSpDefense = 80;
		baseSpeed = 110;
		super.init(startingLevel);

	}

}

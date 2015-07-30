package Jetstorm.Enterprise.Entities.Pokemon;

public class Nidorino extends Pokemon {

	public Nidorino(int startingLevel) {

		species = "NIDORINO";
		nickname = "NIDORINO";
		typeOne = 3; // poison
		typeTwo = 18;
		pkmNumber = 33;
		abilityOne = 1; // poison point or rivalry
		hiddenAbility = 1; // hustle
		friendship = 70;
		bodyStyle = 8; // four legs body head
		pokemonColor = 7; // purple
		eggGroup = 1; // monster
		secondEggGroup = 5; // field
		height = 0.9; // meters standard
		weight = 19.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 128;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 1;
		catchRate = 120;
		baseHealth = 61;
		baseAttack = 72;
		baseDefense = 57;
		baseSpAttack = 55;
		baseSpDefense = 55;
		baseSpeed = 65;
		super.init(startingLevel);

	}

}

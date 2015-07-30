package Jetstorm.Enterprise.Entities.Pokemon;

public class Nidoking extends Pokemon {

	public Nidoking(int startingLevel) {

		species = "NIDOKING";
		nickname = "NIDOKING";
		typeOne = 3; // poison
		typeTwo = 4; // ground
		pkmNumber = 34;
		abilityOne = 1; // poison point or rivalry
		hiddenAbility = 1; // sheer force
		friendship = 70;
		bodyStyle = 6; // two legs body head
		pokemonColor = 7; // purple
		eggGroup = 1; // monster
		secondEggGroup = 5; // field
		height = 1.4; // meters standard
		weight = 62.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 223;
		EVYield[0] = 0;
		EVYield[1] = 3;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 1;
		catchRate = 45;
		baseHealth = 81;
		baseAttack = 92;
		baseDefense = 77;
		baseSpAttack = 85;
		baseSpDefense = 75;
		baseSpeed = 85;
		super.init(startingLevel);

	}

}

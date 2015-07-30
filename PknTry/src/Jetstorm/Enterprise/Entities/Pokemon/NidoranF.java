package Jetstorm.Enterprise.Entities.Pokemon;

public class NidoranF extends Pokemon {

	public NidoranF(int startingLevel) {

		species = "NIDORAN>";
		nickname = "NIDORAN>";
		typeOne = 3; // poison
		typeTwo = 18;
		pkmNumber = 29;
		abilityOne = 1; // poison point or rivalry
		hiddenAbility = 1; // hustle
		friendship = 70;
		bodyStyle = 8; // four legs body head
		pokemonColor = 2; // blue
		eggGroup = 1; // monster
		secondEggGroup = 5; // field
		height = 0.4; // meters standard
		weight = 7.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 55;
		EVYield[0] = 1;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 1;
		catchRate = 235;
		baseHealth = 55;
		baseAttack = 47;
		baseDefense = 52;
		baseSpAttack = 40;
		baseSpDefense = 40;
		baseSpeed = 41;
		super.init(startingLevel);

	}

}

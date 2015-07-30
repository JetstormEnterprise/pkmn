package Jetstorm.Enterprise.Entities.Pokemon;

public class NidoranM extends Pokemon {

	public NidoranM(int startingLevel) {

		species = "NIDORAN<";
		nickname = "NIDORAN<";
		typeOne = 3; // poison
		typeTwo = 18;
		pkmNumber = 32;
		abilityOne = 1; // poison point or rivalry
		hiddenAbility = 1; // hustle
		friendship = 70;
		bodyStyle = 8; // four legs body head
		pokemonColor = 7; // purple
		eggGroup = 1; // monster
		secondEggGroup = 5; // field
		height = 0.5; // meters standard
		weight = 9.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 55;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0;
		catchRate = 235;
		baseHealth = 46;
		baseAttack = 57;
		baseDefense = 40;
		baseSpAttack = 40;
		baseSpDefense = 40;
		baseSpeed = 50;
		super.init(startingLevel);

	}

}

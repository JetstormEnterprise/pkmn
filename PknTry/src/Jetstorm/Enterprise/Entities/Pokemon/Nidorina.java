package Jetstorm.Enterprise.Entities.Pokemon;

public class Nidorina extends Pokemon {

	public Nidorina(int startingLevel) {

		species = "NIDORINA";
		nickname = "NIDORINA";
		typeOne = 3; // poison
		typeTwo = 18;
		pkmNumber = 30;
		abilityOne = 1; // poison point or rivalry
		hiddenAbility = 1; // hustle
		friendship = 70;
		bodyStyle = 8; // four legs body head
		pokemonColor = 2; // blue
		eggGroup = 15; // undiscovered
		secondEggGroup = 0; // none
		height = 0.8; // meters standard
		weight = 20.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 128;
		EVYield[0] = 2;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0;
		catchRate = 120;
		baseHealth = 70;
		baseAttack = 62;
		baseDefense = 67;
		baseSpAttack = 55;
		baseSpDefense = 55;
		baseSpeed = 56;
		super.init(startingLevel);

	}

}

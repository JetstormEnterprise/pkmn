package Jetstorm.Enterprise.Entities.Pokemon;

public class Nidoqueen extends Pokemon {

	public Nidoqueen(int startingLevel) {

		species = "NIDOQUEEN";
		nickname = "NIDOQUEEN";
		typeOne = 3; // poison
		typeTwo = 4; // ground
		pkmNumber = 31;
		abilityOne = 1; // poison point or rivalry
		hiddenAbility = 1; // sheer force
		friendship = 70;
		bodyStyle = 6; // two legs body head
		pokemonColor = 2; // blue
		eggGroup = 15; // undiscovered
		secondEggGroup = 0; // none
		height = 1.3; // meters standard
		weight = 60.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 223;
		EVYield[0] = 3;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0;
		catchRate = 45;
		baseHealth = 90;
		baseAttack = 92;
		baseDefense = 87;
		baseSpAttack = 75;
		baseSpDefense = 85;
		baseSpeed = 76;
		super.init(startingLevel);

	}

}

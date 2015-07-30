package Jetstorm.Enterprise.Entities.Pokemon;

public class Pidgeot extends Pokemon {

	public Pidgeot(int startingLevel) {

		species = "PIDGEOT";
		nickname = "PIDGEOT";
		typeOne = 0; // Normal
		typeTwo = 2; // Flying
		pkmNumber = 18;
		abilityOne = 1; // Keen Eye:Tangled Feet
		hiddenAbility = 1; // Big Pecks
		friendship = 70;
		bodyStyle = 9; // single pair of wings
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 0; // none
		height = 1.5; // meters standard
		weight = 39.5; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 211;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 3;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 83;
		baseAttack = 80;
		baseDefense = 75;
		baseSpAttack = 70;
		baseSpDefense = 70;
		baseSpeed = 101;
		super.init(startingLevel);

	}

}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Pidgeotto extends Pokemon {

	public Pidgeotto(int startingLevel) {

		species = "PIDGEOTTO";
		nickname = "PIDGEOTTO";
		typeOne = 0; // Normal
		typeTwo = 2; // Flying
		pkmNumber = 17;
		abilityOne = 1; // Keen Eye:Tangled Feet
		hiddenAbility = 1; // Big Pecks
		friendship = 70;
		bodyStyle = 9; // single pair of wings
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 0; // none
		height = 1.1; // meters standard
		weight = 30.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 122;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 63;
		baseAttack = 60;
		baseDefense = 55;
		baseSpAttack = 50;
		baseSpDefense = 50;
		baseSpeed = 71;
		super.init(startingLevel);

	}

}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Graveler extends Pokemon {

	public Graveler(int startingLevel) {

		species = "GRAVELER";
		nickname = "GRAVELER";
		typeOne = 5; // rock
		typeTwo = 4; // ground
		pkmNumber = 75;
		abilityOne = 1; // rock head or sturdy
		hiddenAbility = 1; // sand veil
		friendship = 70;
		bodyStyle = 12; // 12? body, head, legs, human like
		pokemonColor = 6; // brown
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 105.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 134;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 55;
		baseAttack = 95;
		baseDefense = 115;
		baseSpAttack = 45;
		baseSpDefense = 45;
		baseSpeed = 35;
		super.init(startingLevel);

	}
	
}

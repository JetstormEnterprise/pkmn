package Jetstorm.Enterprise.Entities.Pokemon;

public class Raticate extends Pokemon {

	public Raticate(int startingLevel) {

		species = "RATICATE";
		nickname = "RATICATE";
		typeOne = 0; // normal
		typeTwo = 18;
		pkmNumber = 20;
		abilityOne = 1; // Run away or Guts
		hiddenAbility = 1; // Hustle
		friendship = 70;
		bodyStyle = 8; // four legs, head, body
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 0; // none
		height = 0.7; // meters standard
		weight = 18.5; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 145;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 127;
		baseHealth = 55;
		baseAttack = 81;
		baseDefense = 60;
		baseSpAttack = 50;
		baseSpDefense = 70;
		baseSpeed = 97;
		super.init(startingLevel);

	}

}

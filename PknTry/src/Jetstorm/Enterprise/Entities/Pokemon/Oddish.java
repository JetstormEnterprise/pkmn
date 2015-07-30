package Jetstorm.Enterprise.Entities.Pokemon;

public class Oddish extends Pokemon {

	public Oddish(int startingLevel) {

		species = "ODDISH";
		nickname = "ODDISH";
		typeOne = 11; // grass
		typeTwo = 3; // poison
		pkmNumber = 43;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // run away
		friendship = 70;
		bodyStyle = 5; // head legs
		pokemonColor = 2; // blue
		eggGroup = 7; // grass
		secondEggGroup = 18; // none
		height = 0.5; // meters standard
		weight = 5.4; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 64;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 45;
		baseAttack = 50;
		baseDefense = 55;
		baseSpAttack = 75;
		baseSpDefense = 65;
		baseSpeed = 30;
		super.init(startingLevel);

	}

}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Bellsprout extends Pokemon {

	public Bellsprout(int startingLevel) {

		species = "BELLSPROUT";
		nickname = "BELLSPROUT";
		typeOne = 11; // grass
		typeTwo = 3; // poison
		pkmNumber = 69;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // gluttony
		friendship = 70;
		bodyStyle = 12; //12? legs, head, humanlike
		pokemonColor = 4; // green
		eggGroup = 7; // grass
		secondEggGroup = 18; // none
		height = 0.7; // meters standard
		weight = 4.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 84;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 50;
		baseAttack = 75;
		baseDefense = 35;
		baseSpAttack = 70;
		baseSpDefense = 30;
		baseSpeed = 40;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Victreebel extends Pokemon {

	public Victreebel(int startingLevel) {

		species = "VICTREEBEL";
		nickname = "VICTREEBEL";
		typeOne = 11; // grass
		typeTwo = 3; // poison
		pkmNumber = 71;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // gluttony
		friendship = 70;
		bodyStyle = 8; // 5? body, head
		pokemonColor = 4; // green
		eggGroup = 1; // grass
		secondEggGroup = 7; //none
		height = 1.7; // meters standard
		weight = 15.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 191;
		EVYield[0] = 0;
		EVYield[1] = 3;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 80;
		baseAttack = 105;
		baseDefense = 65;
		baseSpAttack = 100;
		baseSpDefense = 60;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Gloom extends Pokemon {

	public Gloom(int startingLevel) {

		species = "GLOOM";
		nickname = "GLOOM";
		typeOne = 11; // grass
		typeTwo = 3; // poison
		pkmNumber = 44;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // stench
		friendship = 70;
		bodyStyle = 12; // human like
		pokemonColor = 2; // blue
		eggGroup = 7; // grass
		secondEggGroup = 18; // none
		height = 0.8; // meters standard
		weight = 8.6; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 138;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 60;
		baseAttack = 65;
		baseDefense = 70;
		baseSpAttack = 85;
		baseSpDefense = 75;
		baseSpeed = 40;
		super.init(startingLevel);

	}

}

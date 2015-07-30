package Jetstorm.Enterprise.Entities.Pokemon;

public class Vileplume extends Pokemon {

	public Vileplume(int startingLevel) {

		species = "VILEPLUME";
		nickname = "VILEPLUME";
		typeOne = 11; // grass
		typeTwo = 3; // poison
		pkmNumber = 45;
		abilityOne = 1; // Overgrow
		hiddenAbility = 1; // Chlorophyll
		friendship = 70;
		bodyStyle = 12; // human like
		pokemonColor = 1; // red
		eggGroup = 7; // grass
		secondEggGroup = 18; // none
		height = 1.2; // meters standard
		weight = 18.6; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 216;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 3;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 75;
		baseAttack = 80;
		baseDefense = 85;
		baseSpAttack = 110;
		baseSpDefense = 90;
		baseSpeed = 50;
		super.init(startingLevel);

	}

}

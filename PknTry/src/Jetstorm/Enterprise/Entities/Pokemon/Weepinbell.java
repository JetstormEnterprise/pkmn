package Jetstorm.Enterprise.Entities.Pokemon;

public class Weepinbell extends Pokemon {

	public Weepinbell(int startingLevel) {

		species = "WEEPINBELL";
		nickname = "WEEPINBELL";
		typeOne = 11; // grass
		typeTwo = 3; // poison
		pkmNumber = 70;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // gluttony
		friendship = 70;
		bodyStyle = 8; // 5? body, head
		pokemonColor = 4; // green
		eggGroup = 1; // grass
		secondEggGroup = 7; // none
		height = 1.0; // meters standard
		weight = 6.4; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 151;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 65;
		baseAttack = 90;
		baseDefense = 50;
		baseSpAttack = 85;
		baseSpDefense = 45;
		baseSpeed = 55;
		super.init(startingLevel);

	}
	
}

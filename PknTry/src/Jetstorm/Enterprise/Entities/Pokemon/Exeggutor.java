package Jetstorm.Enterprise.Entities.Pokemon;

public class Exeggutor extends Pokemon {

	public Exeggutor(int startingLevel) {

		species = "EXEGGUTOR";
		nickname = "EXEGGUTOR";
		typeOne = 11; // grass
		typeTwo = 13; // psychic
		pkmNumber = 103;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // harvest
		friendship = 70;
		bodyStyle = 7; // 7? body legs head
		pokemonColor = 3; // yellow
		eggGroup = 7; // grass
		secondEggGroup = 18; // none
		height = 2.0; // meters standard
		weight = 120.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 212;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 95;
		baseAttack = 95;
		baseDefense = 85;
		baseSpAttack = 125;
		baseSpDefense = 65;
		baseSpeed = 55;
		super.init(startingLevel);

	}
	
}

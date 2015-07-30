package Jetstorm.Enterprise.Entities.Pokemon;

public class Beedrill extends Pokemon {

	public Beedrill(int startingLevel) {

		species = "BEEDRILL";
		nickname = "BEEDRILL";
		typeOne = 6; // bug
		typeTwo = 3; // poison
		pkmNumber = 15;
		abilityOne = 1; // Swarm
		hiddenAbility = 1; // Sniper
		friendship = 70;
		bodyStyle = 13; // Two pairs of wings
		pokemonColor = 3; // Yellow
		eggGroup = 3; // bug
		secondEggGroup = 0; // none
		height = 1.0; // meters standard
		weight = 59.5; // kg standard
		hatchTime = 2805; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 173;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 65;
		baseAttack = 80;
		baseDefense = 40;
		baseSpAttack = 45;
		baseSpDefense = 80;
		baseSpeed = 75;
		super.init(startingLevel);

	}


}

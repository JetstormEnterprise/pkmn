package Jetstorm.Enterprise.Entities.Pokemon;

public class Geodude extends Pokemon {

	public Geodude(int startingLevel) {

		species = "BULBASAUR";
		nickname = "BULBASAUR";
		typeOne = 5; // rock
		typeTwo = 4; // ground
		pkmNumber = 74;
		abilityOne = 1; // rock head or sturdy
		hiddenAbility = 1; // sand veil
		friendship = 70;
		bodyStyle = 4; // 4? head, arms
		pokemonColor = 6; // brown
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 0.4; // meters standard
		weight = 20.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 73;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 40;
		baseAttack = 80;
		baseDefense = 100;
		baseSpAttack = 30;
		baseSpDefense = 30;
		baseSpeed = 20;
		super.init(startingLevel);

	}
	
}

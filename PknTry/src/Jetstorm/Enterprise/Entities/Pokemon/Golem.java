package Jetstorm.Enterprise.Entities.Pokemon;

public class Golem extends Pokemon {

	public Golem(int startingLevel) {

		species = "GOLEM";
		nickname = "GOLEM";
		typeOne = 5; // ROCK
		typeTwo = 4; // GROUND
		pkmNumber = 76;
		abilityOne = 1; // rock head or sturdy
		hiddenAbility = 1; // sand veil
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 6; // brown
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 1.4; // meters standard
		weight = 300.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 177;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 3;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 80;
		baseAttack = 110;
		baseDefense = 130;
		baseSpAttack = 55;
		baseSpDefense = 65;
		baseSpeed = 45;
		super.init(startingLevel);

	}
	
}

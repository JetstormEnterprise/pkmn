package Jetstorm.Enterprise.Entities.Pokemon;

public class Rhydon extends Pokemon {

	public Rhydon(int startingLevel) {

		species = "RHYDON";
		nickname = "RHYDON";
		typeOne = 4; // ground
		typeTwo = 5; // rock
		pkmNumber = 112;
		abilityOne = 1; // lightning rod or rock head
		hiddenAbility = 1; // reckless
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 8; // gray
		eggGroup = 1; // monster
		secondEggGroup = 5; // field
		height = 1.9; // meters standard
		weight = 120.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 204;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 60;
		baseHealth = 105;
		baseAttack = 130;
		baseDefense = 120;
		baseSpAttack = 45;
		baseSpDefense = 45;
		baseSpeed = 40;
		super.init(startingLevel);

	}
	
}

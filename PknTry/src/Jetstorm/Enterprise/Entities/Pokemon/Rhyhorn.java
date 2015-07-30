package Jetstorm.Enterprise.Entities.Pokemon;

public class Rhyhorn extends Pokemon {

	public Rhyhorn(int startingLevel) {

		species = "RHYHORN";
		nickname = "RHYHORN";
		typeOne = 4; // ground
		typeTwo = 5; // rock
		pkmNumber = 111;
		abilityOne = 1; // lightning rod or rock head
		hiddenAbility = 1; // reckless
		friendship = 70;
		bodyStyle = 8; // 8? four legs
		pokemonColor = 8; // gray
		eggGroup = 1; // monster
		secondEggGroup = 5; // field
		height = 1.0; // meters standard
		weight = 115.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 135;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 80;
		baseAttack = 85;
		baseDefense = 95;
		baseSpAttack = 30;
		baseSpDefense = 30;
		baseSpeed = 25;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Diglett extends Pokemon {

	public Diglett(int startingLevel) {

		species = "DIGLETT";
		nickname = "DIGLETT";
		typeOne = 4; // ground
		typeTwo = 18;
		pkmNumber = 50;
		abilityOne = 1; // sand veil or arena trap
		hiddenAbility = 1; // sand force
		friendship = 70;
		bodyStyle = 1; // head
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 0.2; // meters standard
		weight = 0.8; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 53;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 10;
		baseAttack = 55;
		baseDefense = 25;
		baseSpAttack = 35;
		baseSpDefense = 45;
		baseSpeed = 95;
		super.init(startingLevel);

	}

}

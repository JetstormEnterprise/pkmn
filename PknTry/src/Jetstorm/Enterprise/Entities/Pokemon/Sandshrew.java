package Jetstorm.Enterprise.Entities.Pokemon;

public class Sandshrew extends Pokemon {

	public Sandshrew(int startingLevel) {

		species = "SANDSHREW";
		nickname = "SANDSHREW";
		typeOne = 4; // ground
		typeTwo = 18;
		pkmNumber = 27;
		abilityOne = 1; // sand veil
		hiddenAbility = 1; // sand rush
		friendship = 70;
		bodyStyle = 6; // two legs body head
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 0; // none
		height = 0.6; // meters standard
		weight = 12.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 60;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 50;
		baseAttack = 75;
		baseDefense = 85;
		baseSpAttack = 20;
		baseSpDefense = 30;
		baseSpeed = 40;
		super.init(startingLevel);

	}

}

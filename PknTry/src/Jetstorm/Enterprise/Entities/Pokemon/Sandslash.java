package Jetstorm.Enterprise.Entities.Pokemon;

public class Sandslash extends Pokemon {

	public Sandslash(int startingLevel) {

		species = "SANDSLASH";
		nickname = "SANDSLASH";
		typeOne = 4; // ground
		typeTwo = 18;
		pkmNumber = 28;
		abilityOne = 1; // sand veil
		hiddenAbility = 1; // sand rush
		friendship = 70;
		bodyStyle = 6; // two legs body head
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 0; // none
		height = 1.0; // meters standard
		weight = 29.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 158;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 75;
		baseAttack = 100;
		baseDefense = 110;
		baseSpAttack = 45;
		baseSpDefense = 55;
		baseSpeed = 65;
		super.init(startingLevel);

	}

}

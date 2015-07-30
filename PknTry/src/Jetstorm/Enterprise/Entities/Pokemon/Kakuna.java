package Jetstorm.Enterprise.Entities.Pokemon;

public class Kakuna extends Pokemon {

	public Kakuna(int startingLevel) {

		species = "KAKUNA";
		nickname = "KAKUNA";
		typeOne = 6; // bug
		typeTwo = 3; // poison
		pkmNumber = 14;
		abilityOne = 1; // Shed Skin
		hiddenAbility = 1; // none
		friendship = 70;
		bodyStyle = 2; // Serpentine
		pokemonColor = 3; // Yellow
		eggGroup = 3; // bug
		secondEggGroup = 0; // none
		height = 0.6; // meters standard
		weight = 10.0; // kg standard
		hatchTime = 2805; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 72;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 45;
		baseAttack = 25;
		baseDefense = 50;
		baseSpAttack = 25;
		baseSpDefense = 25;
		baseSpeed = 35;
		super.init(startingLevel);

	}


}

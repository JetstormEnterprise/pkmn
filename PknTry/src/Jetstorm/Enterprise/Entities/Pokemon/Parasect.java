package Jetstorm.Enterprise.Entities.Pokemon;

public class Parasect extends Pokemon {

	public Parasect(int startingLevel) {

		species = "PARASECT";
		nickname = "PARASECT";
		typeOne = 6; // bug
		typeTwo = 11; // grass
		pkmNumber = 47;
		abilityOne = 1; // effect spore or dry skin
		hiddenAbility = 1; // damp
		friendship = 70;
		bodyStyle = 14; // insectoid
		pokemonColor = 1; // red
		eggGroup = 3; // bug
		secondEggGroup = 7; // grass
		height = 1.0; // meters standard
		weight = 29.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 142;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 60;
		baseAttack = 95;
		baseDefense = 80;
		baseSpAttack = 60;
		baseSpDefense = 80;
		baseSpeed = 30;
		super.init(startingLevel);

	}

}

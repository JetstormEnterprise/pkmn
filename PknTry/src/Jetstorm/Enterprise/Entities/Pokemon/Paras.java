package Jetstorm.Enterprise.Entities.Pokemon;

public class Paras extends Pokemon {

	public Paras(int startingLevel) {

		species = "PARAS";
		nickname = "PARAS";
		typeOne = 7; // bug
		typeTwo = 11; // grass
		pkmNumber = 46;
		abilityOne = 1; // effect spore or dry skin
		hiddenAbility = 1; // damp
		friendship = 70;
		bodyStyle = 14; // insectoid
		pokemonColor = 1; // red
		eggGroup = 3; // bug
		secondEggGroup = 7; // grass
		height = 0.3; // meters standard
		weight = 5.4; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 57;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 35;
		baseAttack = 70;
		baseDefense = 55;
		baseSpAttack = 45;
		baseSpDefense = 55;
		baseSpeed = 25;
		super.init(startingLevel);

	}

}

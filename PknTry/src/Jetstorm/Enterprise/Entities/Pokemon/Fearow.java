package Jetstorm.Enterprise.Entities.Pokemon;

public class Fearow extends Pokemon {

	public Fearow(int startingLevel) {

		species = "FEAROW";
		nickname = "FEAROW";
		typeOne = 0; // normal
		typeTwo = 2; // flying
		pkmNumber = 22;
		abilityOne = 1; // keen eye
		hiddenAbility = 1; // sniper
		friendship = 70;
		bodyStyle = 9; // one set of wings
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 0; // none
		height = 1.2; // meters standard
		weight = 38.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 155;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 65;
		baseAttack = 90;
		baseDefense = 65;
		baseSpAttack = 61;
		baseSpDefense = 61;
		baseSpeed = 100;
		super.init(startingLevel);

	}

}

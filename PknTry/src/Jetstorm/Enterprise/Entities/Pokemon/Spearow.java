package Jetstorm.Enterprise.Entities.Pokemon;

public class Spearow extends Pokemon {

	public Spearow(int startingLevel) {

		species = "SPEAROW";
		nickname = "SPEAROW";
		typeOne = 0; // normal
		typeTwo = 2; // flying
		pkmNumber = 21;
		abilityOne = 1; // keen eye
		hiddenAbility = 1; // sniper
		friendship = 70;
		bodyStyle = 9; // one set of wings
		pokemonColor = 6; // brown
		eggGroup = 4; // flying
		secondEggGroup = 0; // none
		height = 0.3; // meters standard
		weight = 2.0; // kg standard
		hatchTime = 4080; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 52;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 40;
		baseAttack = 60;
		baseDefense = 30;
		baseSpAttack = 31;
		baseSpDefense = 31;
		baseSpeed = 70;
		super.init(startingLevel);

	}

}

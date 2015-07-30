package Jetstorm.Enterprise.Entities.Pokemon;

public class Metapod extends Pokemon {

	public Metapod(int startingLevel) {

		species = "METAPOD";
		nickname = "METAPOD";
		typeOne = 6; // bug
		typeTwo = 18;
		pkmNumber = 11;
		abilityOne = 1; // Shed Skin
		hiddenAbility = 1; // None
		friendship = 70;
		bodyStyle = 2; // Serpentine
		pokemonColor = 4;
		eggGroup = 3; // bug
		secondEggGroup = 0; // none
		height = 0.7; // meters standard
		weight = 9.9; // kg standard
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
		baseHealth = 50;
		baseAttack = 20;
		baseDefense = 55;
		baseSpAttack = 25;
		baseSpDefense = 25;
		baseSpeed = 30;
		super.init(startingLevel);

	}

}

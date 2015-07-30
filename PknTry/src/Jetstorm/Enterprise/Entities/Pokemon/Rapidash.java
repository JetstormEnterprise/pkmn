package Jetstorm.Enterprise.Entities.Pokemon;

public class Rapidash extends Pokemon {

	public Rapidash(int startingLevel) {

		species = "RAPIDASH";
		nickname = "RAPIDASH";
		typeOne = 9; // fire
		typeTwo = 18; // none
		pkmNumber = 78;
		abilityOne = 1; // run away or flash fire
		hiddenAbility = 1; // flame body
		friendship = 70;
		bodyStyle = 8; // 8? four legs
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 1.7; // meters standard
		weight = 95.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 192;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 60;
		baseHealth = 65;
		baseAttack = 100;
		baseDefense = 70;
		baseSpAttack = 80;
		baseSpDefense = 80;
		baseSpeed = 105;
		super.init(startingLevel);

	}
	
}

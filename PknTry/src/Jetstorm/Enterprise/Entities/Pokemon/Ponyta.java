package Jetstorm.Enterprise.Entities.Pokemon;

public class Ponyta extends Pokemon {

	public Ponyta(int startingLevel) {

		species = "PONYTA";
		nickname = "PONYTA";
		typeOne = 9; // fire
		typeTwo = 18; // none
		pkmNumber = 77;
		abilityOne = 1; // run away or flash fire
		hiddenAbility = 1; // flame body
		friendship = 70;
		bodyStyle = 8; // 8? four legs
		pokemonColor = 3; // yellow
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 30.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 152;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 50;
		baseAttack = 85;
		baseDefense = 55;
		baseSpAttack = 65;
		baseSpDefense = 65;
		baseSpeed = 90;
		super.init(startingLevel);

	}
	
}

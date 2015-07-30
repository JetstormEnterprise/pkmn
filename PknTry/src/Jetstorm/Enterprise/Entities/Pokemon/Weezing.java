package Jetstorm.Enterprise.Entities.Pokemon;

public class Weezing extends Pokemon {

	public Weezing(int startingLevel) {

		species = "WEEZING";
		nickname = "WEEZING";
		typeOne = 3; // poison
		typeTwo = 18; // none
		pkmNumber = 110;
		abilityOne = 1; // levitate
		hiddenAbility = 1; // none
		friendship = 70;
		bodyStyle = 11; // 11? multi heads
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 1.2; // meters standard
		weight = 9.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 1173;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 60;
		baseHealth = 65;
		baseAttack = 90;
		baseDefense = 120;
		baseSpAttack = 85;
		baseSpDefense = 70;
		baseSpeed = 60;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Seel  extends Pokemon {

	public Seel(int startingLevel) {

		species = "SEEL";
		nickname = "SEEL";
		typeOne = 10; // water
		typeTwo = 18; // none
		pkmNumber = 86;
		abilityOne = 1; // thick fat or hydration
		hiddenAbility = 1; // ice body
		friendship = 70;
		bodyStyle = 3; // 3? flipper seel like
		pokemonColor = 9; // white
		eggGroup = 2; // water 1
		secondEggGroup = 5; // field
		height = 1.1; // meters standard
		weight = 90.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 100;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 65;
		baseAttack = 45;
		baseDefense = 55;
		baseSpAttack = 45;
		baseSpDefense = 70;
		baseSpeed = 45;
		super.init(startingLevel);

	}
	
}

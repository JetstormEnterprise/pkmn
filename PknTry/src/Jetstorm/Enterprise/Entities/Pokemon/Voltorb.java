package Jetstorm.Enterprise.Entities.Pokemon;

public class Voltorb extends Pokemon {

	public Voltorb(int startingLevel) {

		species = "VOLTORB";
		nickname = "VOLTORB";
		typeOne = 12; // electric
		typeTwo = 18; // none
		pkmNumber = 100;
		abilityOne = 1; // soundproof or static
		hiddenAbility = 1; // aftermath
		friendship = 70;
		bodyStyle = 1; // 1? head
		pokemonColor = 1; // red
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 0.5; // meters standard
		weight = 10.4; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 103;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5; // genderless
		catchRate = 190;
		baseHealth = 40;
		baseAttack = 30;
		baseDefense = 50;
		baseSpAttack = 55;
		baseSpDefense = 55;
		baseSpeed = 100;
		super.init(startingLevel);

	}
	
}

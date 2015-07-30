package Jetstorm.Enterprise.Entities.Pokemon;

public class Electrode extends Pokemon {

	public Electrode(int startingLevel) {

		species = "ELECTRODE";
		nickname = "ELECTRODE";
		typeOne = 12; // electric
		typeTwo = 18; // none
		pkmNumber = 101;
		abilityOne = 1; // soundproof or static
		hiddenAbility = 1; // aftermath
		friendship = 70;
		bodyStyle = 1; // 1? head
		pokemonColor = 1; // red
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 1.2; // meters standard
		weight = 66.6; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 168;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5; // genderless
		catchRate = 60;
		baseHealth = 60;
		baseAttack = 50;
		baseDefense = 70;
		baseSpAttack = 80;
		baseSpDefense = 80;
		baseSpeed = 140;
		super.init(startingLevel);

	}
	
}

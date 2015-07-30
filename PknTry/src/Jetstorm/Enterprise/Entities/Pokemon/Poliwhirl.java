package Jetstorm.Enterprise.Entities.Pokemon;

public class Poliwhirl  extends Pokemon {

	public Poliwhirl(int startingLevel) {

		species = "POLIWHIRL";
		nickname = "POLIWHIRL";
		typeOne = 10; // water
		typeTwo = 18; // none
		pkmNumber = 61;
		abilityOne = 1; // water absorb or damp
		hiddenAbility = 1; // swift swim
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 2; // blue
		eggGroup = 2; // water 1
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 20.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 135;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 2;
		genderRatio = 0.5;
		catchRate = 120;
		baseHealth = 65;
		baseAttack = 65;
		baseDefense = 65;
		baseSpAttack = 50;
		baseSpDefense = 50;
		baseSpeed = 90;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Poliwrath  extends Pokemon {

	public Poliwrath(int startingLevel) {

		species = "POLIWRATH";
		nickname = "POLIWRATH";
		typeOne = 10; // water
		typeTwo = 18; // fighting
		pkmNumber = 62;
		abilityOne = 1; // water absorb or damp
		hiddenAbility = 1; // swift swim
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 2; // blue
		eggGroup = 2; // water 1
		secondEggGroup = 18; // none
		height = 1.3; // meters standard
		weight = 54.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 225;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 3;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 45;
		baseHealth = 90;
		baseAttack = 95;
		baseDefense = 95;
		baseSpAttack = 70;
		baseSpDefense = 90;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}

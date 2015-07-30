package Jetstorm.Enterprise.Entities.Pokemon;

public class Poliwag  extends Pokemon {

	public Poliwag(int startingLevel) {

		species = "POLIWAG";
		nickname = "POLIWAG";
		typeOne = 10; // water
		typeTwo = 18; // none
		pkmNumber = 60;
		abilityOne = 1; // water absorb or damp
		hiddenAbility = 1; // swift swim
		friendship = 70;
		bodyStyle = 7; // 7? body legs
		pokemonColor = 2; // blue
		eggGroup = 2; // water 1
		secondEggGroup = 18; // none
		height = 0.6; // meters standard
		weight = 12.4; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 77;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 1;
		genderRatio = 0.5;
		catchRate = 255;
		baseHealth = 40;
		baseAttack = 50;
		baseDefense = 40;
		baseSpAttack = 40;
		baseSpDefense = 40;
		baseSpeed = 90;
		super.init(startingLevel);

	}
	
}

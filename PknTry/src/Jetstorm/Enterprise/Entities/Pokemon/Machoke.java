package Jetstorm.Enterprise.Entities.Pokemon;

public class Machoke  extends Pokemon {

	public Machoke(int startingLevel) {

		species = "MACHOKE";
		nickname = "MACHOKE";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 67;
		abilityOne = 1; // guts or no guard
		hiddenAbility = 1; // steadfast
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 8; // gray
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.5; // meters standard
		weight = 70.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 146;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.75;
		catchRate = 90;
		baseHealth = 80;
		baseAttack = 100;
		baseDefense = 70;
		baseSpAttack = 50;
		baseSpDefense = 60;
		baseSpeed = 45;
		super.init(startingLevel);

	}
	
}

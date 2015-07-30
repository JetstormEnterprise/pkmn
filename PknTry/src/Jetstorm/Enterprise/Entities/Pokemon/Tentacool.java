package Jetstorm.Enterprise.Entities.Pokemon;

public class Tentacool extends Pokemon {

	public Tentacool(int startingLevel) {

		species = "TENTACOOL";
		nickname = "TENTACOOL";
		typeOne = 10; // water
		typeTwo = 3; // poison
		pkmNumber = 72;
		abilityOne = 1; // clear body or liquid ooze
		hiddenAbility = 1; // rain dish
		friendship = 70;
		bodyStyle = 10; // 10? tentacle body
		pokemonColor = 2; // blue
		eggGroup = 9; // water 3
		secondEggGroup = 18; // none
		height = 0.9; // meters standard
		weight = 45.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 105;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 40;
		baseAttack = 40;
		baseDefense = 35;
		baseSpAttack = 50;
		baseSpDefense = 100;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}

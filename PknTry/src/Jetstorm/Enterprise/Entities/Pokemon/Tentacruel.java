package Jetstorm.Enterprise.Entities.Pokemon;

public class Tentacruel extends Pokemon {

	public Tentacruel(int startingLevel) {

		species = "TENTACRUEL";
		nickname = "TENTACRUEL";
		typeOne = 10; // water
		typeTwo = 3; // poison
		pkmNumber = 73;
		abilityOne = 1; // clear body or liquid ooze
		hiddenAbility = 1; // rain dish
		friendship = 70;
		bodyStyle = 10; // 10? tentacle body
		pokemonColor = 2; // blue
		eggGroup = 9; // water 3
		secondEggGroup = 18; // none
		height = 1.6; // meters standard
		weight = 55.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 205;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 2;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 60;
		baseHealth = 80;
		baseAttack = 70;
		baseDefense = 65;
		baseSpAttack = 80;
		baseSpDefense = 120;
		baseSpeed = 100;
		super.init(startingLevel);

	}
	
}

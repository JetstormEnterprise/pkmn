package Jetstorm.Enterprise.Entities.Pokemon;

public class Haunter  extends Pokemon {

	public Haunter(int startingLevel) {

		species = "HAUNTER";
		nickname = "HAUNTER";
		typeOne = 7; // ghost
		typeTwo = 3; // poison
		pkmNumber = 93;
		abilityOne = 1; // levitate
		hiddenAbility = 1; // none
		friendship = 70;
		bodyStyle = 4; // 4? head arms
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 1.6; // meters standard
		weight = 0.1; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 142;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 45;
		baseAttack = 50;
		baseDefense = 45;
		baseSpAttack = 115;
		baseSpDefense = 55;
		baseSpeed = 95;
		super.init(startingLevel);

	}
	
}

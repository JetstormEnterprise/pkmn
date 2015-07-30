package Jetstorm.Enterprise.Entities.Pokemon;

public class Gastly  extends Pokemon {

	public Gastly(int startingLevel) {

		species = "GASTLY";
		nickname = "GASTLY";
		typeOne = 7; // ghost
		typeTwo = 3; // poison
		pkmNumber = 92;
		abilityOne = 1; // levitate
		hiddenAbility = 1; // none
		friendship = 70;
		bodyStyle = 1; // 1? head
		pokemonColor = 7; // purple
		eggGroup = 11; // amorphous
		secondEggGroup = 18; // none
		height = 1.3; // meters standard
		weight = 0.1; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Slow";
		baseExpYield = 95;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 30;
		baseAttack = 35;
		baseDefense = 30;
		baseSpAttack = 100;
		baseSpDefense = 35;
		baseSpeed = 80;
		super.init(startingLevel);

	}
	
}

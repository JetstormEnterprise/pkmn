package Jetstorm.Enterprise.Entities.Pokemon;

public class Shellder  extends Pokemon {

	public Shellder(int startingLevel) {

		species = "SHELLDER";
		nickname = "SHELLDER";
		typeOne = 10; // water
		typeTwo = 18; // none
		pkmNumber = 90;
		abilityOne = 1; // shell armor or skill link
		hiddenAbility = 1; // overcoat
		friendship = 70;
		bodyStyle = 1; // 1? head
		pokemonColor = 7; // purple
		eggGroup = 9; // water 3
		secondEggGroup = 18; // none
		height = 0.3; // meters standard
		weight = 4.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 97;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 30;
		baseAttack = 65;
		baseDefense = 100;
		baseSpAttack = 45;
		baseSpDefense = 25;
		baseSpeed = 40;
		super.init(startingLevel);

	}
	
}

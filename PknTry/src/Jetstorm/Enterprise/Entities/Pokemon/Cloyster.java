package Jetstorm.Enterprise.Entities.Pokemon;

public class Cloyster  extends Pokemon {

	public Cloyster(int startingLevel) {

		species = "CLOYSTER";
		nickname = "CLOYSTER";
		typeOne = 10; // water
		typeTwo = 14; // ice
		pkmNumber = 91;
		abilityOne = 1; // shell armor or skill link
		hiddenAbility = 1; // overcoat
		friendship = 70;
		bodyStyle = 1; // 1? head
		pokemonColor = 7; // purple
		eggGroup = 9; // water 3
		secondEggGroup = 18; // none
		height = 1.5; // meters standard
		weight = 132.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 203;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 2;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 60;
		baseHealth = 50;
		baseAttack = 95;
		baseDefense = 180;
		baseSpAttack = 85;
		baseSpDefense = 45;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Krabby extends Pokemon {

	public Krabby(int startingLevel) {

		species = "KRABBY";
		nickname = "KRABBY";
		typeOne = 10; // water
		typeTwo = 18; // none
		pkmNumber = 98;
		abilityOne = 1; // hyper cutter or shell armor
		hiddenAbility = 1; // sheer force
		friendship = 70;
		bodyStyle = 14; // 14? insect
		pokemonColor = 1; // red
		eggGroup = 9; // water 3
		secondEggGroup = 18; // none
		height = 0.4; // meters standard
		weight = 6.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 115;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 225;
		baseHealth = 30;
		baseAttack = 105;
		baseDefense = 90;
		baseSpAttack = 25;
		baseSpDefense = 25;
		baseSpeed = 50;
		super.init(startingLevel);

	}
	
}

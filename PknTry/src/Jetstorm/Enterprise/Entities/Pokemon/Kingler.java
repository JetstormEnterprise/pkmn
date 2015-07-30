package Jetstorm.Enterprise.Entities.Pokemon;

public class Kingler extends Pokemon {

	public Kingler(int startingLevel) {

		species = "KINGLER";
		nickname = "KINGLER";
		typeOne = 10; // water
		typeTwo = 18; // none
		pkmNumber = 99;
		abilityOne = 1; // hyper cutter or shell armor
		hiddenAbility = 1; // sheer force
		friendship = 70;
		bodyStyle = 14; // 14? insectiod
		pokemonColor = 1; // red
		eggGroup = 9; // water 3
		secondEggGroup = 18; // none
		height = 1.3; // meters standard
		weight = 60.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 206;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 60;
		baseHealth = 55;
		baseAttack = 130;
		baseDefense = 115;
		baseSpAttack = 50;
		baseSpDefense = 50;
		baseSpeed = 75;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Exeggcute extends Pokemon {

	public Exeggcute(int startingLevel) {

		species = "EXEGGCUTE";
		nickname = "EXEGGCUTE";
		typeOne = 11; // grass
		typeTwo = 13; // psychic
		pkmNumber = 102;
		abilityOne = 1; // chlorophyll
		hiddenAbility = 1; // harvest
		friendship = 70;
		bodyStyle = 11; // 11? multi heads
		pokemonColor = 10; // pink
		eggGroup = 7; // grass
		secondEggGroup = 18; // none
		height = 0.4; // meters standard
		weight = 2.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Slow";
		baseExpYield = 198;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 90;
		baseHealth = 60;
		baseAttack = 40;
		baseDefense = 80;
		baseSpAttack = 60;
		baseSpDefense = 45;
		baseSpeed = 40;
		super.init(startingLevel);

	}
	
}

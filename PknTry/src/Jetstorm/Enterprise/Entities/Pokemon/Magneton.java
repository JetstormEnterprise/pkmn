package Jetstorm.Enterprise.Entities.Pokemon;

public class Magneton extends Pokemon {

	public Magneton(int startingLevel) {

		species = "MAGNETON";
		nickname = "MAGNETON";
		typeOne = 12; // electric
		typeTwo = 8; // steel
		pkmNumber = 82;
		abilityOne = 1; // magnet pull or sturdy
		hiddenAbility = 1; // analytic
		friendship = 70;
		bodyStyle = 11; // 11? multiple heads
		pokemonColor = 8; // gray
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 60.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 161;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 2;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.875; // genderless
		catchRate = 60;
		baseHealth = 50;
		baseAttack = 60;
		baseDefense = 95;
		baseSpAttack = 120;
		baseSpDefense = 70;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}

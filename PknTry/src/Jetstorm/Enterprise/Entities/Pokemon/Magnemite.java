package Jetstorm.Enterprise.Entities.Pokemon;

public class Magnemite extends Pokemon {

	public Magnemite(int startingLevel) {

		species = "MAGNEMITE";
		nickname = "MAGNEMITE";
		typeOne = 12; // electric
		typeTwo = 8; // steel
		pkmNumber = 81;
		abilityOne = 1; // magnet pull or sturdy
		hiddenAbility = 1; // analytic
		friendship = 70;
		bodyStyle = 4; // 4? head, arms
		pokemonColor = 8; // gray
		eggGroup = 10; // mineral
		secondEggGroup = 18; // none
		height = 0.3; // meters standard
		weight = 6.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 89;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 1;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.875; // genderless
		catchRate = 190;
		baseHealth = 25;
		baseAttack = 35;
		baseDefense = 70;
		baseSpAttack = 95;
		baseSpDefense = 55;
		baseSpeed = 45;
		super.init(startingLevel);

	}
	
}

package Jetstorm.Enterprise.Entities.Pokemon;

public class Cubone extends Pokemon {

	public Cubone(int startingLevel) {

		species = "CUBONE";
		nickname = "CUBONE";
		typeOne = 4; // ground
		typeTwo = 18; // none
		pkmNumber = 104;
		abilityOne = 1; // rock head or lightning rod
		hiddenAbility = 1; // battle armor
		friendship = 70;
		bodyStyle = 6; // 6? arms legs tail
		pokemonColor = 6; // brown
		eggGroup = 1; // monster
		secondEggGroup = 18; // none
		height = 0.4; // meters standard
		weight = 6.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 87;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 1;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 50;
		baseAttack = 50;
		baseDefense = 95;
		baseSpAttack = 40;
		baseSpDefense = 50;
		baseSpeed = 35;
		super.init(startingLevel);

	}
	
}

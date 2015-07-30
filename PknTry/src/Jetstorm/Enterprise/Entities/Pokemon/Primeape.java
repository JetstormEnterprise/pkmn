package Jetstorm.Enterprise.Entities.Pokemon;

public class Primeape extends Pokemon {

	public Primeape(int startingLevel) {

		species = "PRIMEAPE";
		nickname = "PRIMEAPE";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 57;
		abilityOne = 1; // vital spirit or anger point
		hiddenAbility = 1; // defiant
		friendship = 70;
		bodyStyle = 6; // 6? legs, arms, tail
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 32.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 159;
		EVYield[0] = 0;
		EVYield[1] = 2;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 65;
		baseAttack = 105;
		baseDefense = 60;
		baseSpAttack = 60;
		baseSpDefense = 70;
		baseSpeed = 95;
		super.init(startingLevel);

	}
	
}

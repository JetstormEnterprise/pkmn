package Jetstorm.Enterprise.Entities.Pokemon;

public class Dewgong  extends Pokemon {

	public Dewgong(int startingLevel) {

		species = "DEWGONG";
		nickname = "DEWGONG";
		typeOne = 10; // water
		typeTwo = 14; // ice
		pkmNumber = 87;
		abilityOne = 1; // thick fat or hydration
		hiddenAbility = 1; // ice body
		friendship = 70;
		bodyStyle = 3; // 3? seel like body
		pokemonColor = 9; // white
		eggGroup = 2; // water 1
		secondEggGroup = 5; // field
		height = 1.7; // meters standard
		weight = 120.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 176;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 2;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 75;
		baseHealth = 90;
		baseAttack = 70;
		baseDefense = 80;
		baseSpAttack = 70;
		baseSpDefense = 95;
		baseSpeed = 70;
		super.init(startingLevel);

	}
	
}

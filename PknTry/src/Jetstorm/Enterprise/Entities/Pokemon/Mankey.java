package Jetstorm.Enterprise.Entities.Pokemon;

public class Mankey extends Pokemon {

	public Mankey(int startingLevel) {

		species = "MANKEY";
		nickname = "MANKEY";
		typeOne = 1; // fighting
		typeTwo = 18; // none
		pkmNumber = 56;
		abilityOne = 1; // vital spirit or anger point
		hiddenAbility = 1; // defiant
		friendship = 70;
		bodyStyle = 6; // two legs, tail
		pokemonColor = 6; // brown
		eggGroup = 5; // field
		secondEggGroup = 18; // none
		height = 0.5; // meters standard
		weight = 28.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 61;
		EVYield[0] = 0;
		EVYield[1] = 1;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 40;
		baseAttack = 80;
		baseDefense = 35;
		baseSpAttack = 35;
		baseSpDefense = 45;
		baseSpeed = 70;
		super.init(startingLevel);

	}

}

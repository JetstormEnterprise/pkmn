package Jetstorm.Enterprise.Entities.Pokemon;

public class Clefable extends Pokemon {

	public Clefable(int startingLevel) {

		species = "CLEFABLE";
		nickname = "CLEFABLE";
		typeOne = 17; // fairy
		typeTwo = 18;
		pkmNumber = 36;
		abilityOne = 1; // cute charm or magic gruard
		hiddenAbility = 1; // unaware
		friendship = 140;
		bodyStyle = 6; // two legs body head
		pokemonColor = 10; // pink
		eggGroup = 6; // fairy
		secondEggGroup = 0; // none
		height = 1.3; // meters standard
		weight = 40.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Fast";
		baseExpYield = 213;
		EVYield[0] = 3;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.25;
		catchRate = 25;
		baseHealth = 95;
		baseAttack = 70;
		baseDefense = 73;
		baseSpAttack = 85;
		baseSpDefense = 90;
		baseSpeed = 60;
		super.init(startingLevel);

	}

}

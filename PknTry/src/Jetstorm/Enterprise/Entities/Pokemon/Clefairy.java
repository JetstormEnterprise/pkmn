package Jetstorm.Enterprise.Entities.Pokemon;

public class Clefairy extends Pokemon {

	public Clefairy(int startingLevel) {

		species = "CLEFAIRY";
		nickname = "CLEFAIRY";
		typeOne = 17; // fairy
		typeTwo = 18;
		pkmNumber = 35;
		abilityOne = 1; // cute charm or magic guard
		hiddenAbility = 1; // friend guard
		friendship = 140;
		bodyStyle = 6; // two legs body head
		pokemonColor = 10; // pink
		eggGroup = 6; // fairy
		secondEggGroup = 0; // none
		height = 0.6; // meters standard
		weight = 7.5; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Fast";
		baseExpYield = 113;
		EVYield[0] = 2;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.25;
		catchRate = 150;
		baseHealth = 70;
		baseAttack = 45;
		baseDefense = 48;
		baseSpAttack = 60;
		baseSpDefense = 65;
		baseSpeed = 35;
		super.init(startingLevel);

	}

}

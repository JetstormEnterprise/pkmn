package Jetstorm.Enterprise.Entities.Pokemon;

public class Wigglytuff extends Pokemon {

	public Wigglytuff(int startingLevel) {

		species = "WIGGLYTUFF";
		nickname = "WIGGLYTUFF";
		typeOne = 0; // normal
		typeTwo = 17; // fairy
		pkmNumber = 40;
		abilityOne = 1; // cute charm or competitive
		hiddenAbility = 1; // frisk
		friendship = 70;
		bodyStyle = 12; // human like
		pokemonColor = 10; // pink
		eggGroup = 6; // fairy
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 12.0; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "fast";
		baseExpYield = 191;
		EVYield[0] = 3;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 0;
		EVYield[5] = 0;
		genderRatio = 0.25;
		catchRate = 50;
		baseHealth = 140;
		baseAttack = 70;
		baseDefense = 45;
		baseSpAttack = 85;
		baseSpDefense = 50;
		baseSpeed = 45;
		super.init(startingLevel);

	}

}

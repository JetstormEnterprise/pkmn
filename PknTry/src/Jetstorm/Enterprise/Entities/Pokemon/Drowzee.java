package Jetstorm.Enterprise.Entities.Pokemon;

public class Drowzee extends Pokemon {

	public Drowzee(int startingLevel) {

		species = "DROWZEE";
		nickname = "DROWZEE";
		typeOne = 13; // psychic
		typeTwo = 18; // none
		pkmNumber = 96;
		abilityOne = 1; // insomnia or forewarn
		hiddenAbility = 1; // inner focus
		friendship = 70;
		bodyStyle = 12; // 12? human like
		pokemonColor = 3; // yellow
		eggGroup = 8; // human-like
		secondEggGroup = 18; // none
		height = 1.0; // meters standard
		weight = 32.4; // kg standard
		hatchTime = 5355; // Lowest
		levelStyle = "Medium Fast";
		baseExpYield = 102;
		EVYield[0] = 0;
		EVYield[1] = 0;
		EVYield[2] = 0;
		EVYield[3] = 0;
		EVYield[4] = 1;
		EVYield[5] = 0;
		genderRatio = 0.5;
		catchRate = 190;
		baseHealth = 60;
		baseAttack = 48;
		baseDefense = 45;
		baseSpAttack = 43;
		baseSpDefense = 90;
		baseSpeed = 42;
		super.init(startingLevel);

	}
	
}
